package command;

public class RemoveTariffCommand implements Command {
    public String description() { return "Видалити тариф"; }
    public int execute(String[] params) {
        System.out.println("Видалення тарифу: функція ще не реалізована.");
        return 0;
    }
}
