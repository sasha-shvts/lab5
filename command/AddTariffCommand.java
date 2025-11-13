package command;

public class AddTariffCommand implements Command {
    public String description() { return "Додати новий тариф"; }
    public int execute(String[] params) {
        System.out.println("Додавання тарифу: функція ще не реалізована.");
        return 0;
    }
}
