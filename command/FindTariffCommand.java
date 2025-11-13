package command;

public class FindTariffCommand implements Command {
    public String description() { return "Пошук тарифу"; }
    public int execute(String[] params) {
        System.out.println("Пошук тарифу: функція ще не реалізована.");
        return 0;
    }
}
