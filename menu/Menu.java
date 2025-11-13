package menu;

import command.*;
import java.util.*;

public class Menu {
    private List<Command> commandList = new ArrayList<>();
    private List<String> commandKeys = new ArrayList<>();

    public Menu() {
        commandList.add(new AddTariffCommand());     commandKeys.add("add");
        commandList.add(new RemoveTariffCommand());  commandKeys.add("remove");
        commandList.add(new FindTariffCommand());    commandKeys.add("find");
        commandList.add(new CountClientsCommand());  commandKeys.add("count");
        commandList.add(new SortTariffsCommand());   commandKeys.add("sort");
        commandList.add(new SaveCommand());          commandKeys.add("save");
        commandList.add(new LoadCommand());          commandKeys.add("load");
        commandList.add(new EditTariffCommand());    commandKeys.add("edit");
        commandList.add(new ViewTariffsCommand());   commandKeys.add("view");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Мобільна компанія. Для списку команд — help. Для виходу — exit.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equals("help")) {
                System.out.println("Список команд:");
                for (int i = 0; i < commandList.size(); i++) {
                    System.out.printf("%d. %s — %s%n",
                            i + 1, commandKeys.get(i), commandList.get(i).description()
                    );
                }
                System.out.println("0. Вийти з програми");
                continue;
            }
            if (input.equals("exit") || input.equals("0")) {
                System.out.println("Завершення роботи.");
                break;
            }
            if (input.isEmpty()) continue;

            // спроба вибору за номером
            try {
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= commandList.size()) {
                    int result = commandList.get(num - 1).execute(new String[0]);
                } else {
                    System.out.println("Невірний номер команди! Введіть help для списку.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введіть номер команди або 'help'.");
            }
        }
    }
}

