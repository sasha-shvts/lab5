package command;

public class EditTariffCommand implements Command {
    public String description() { return "Редагувати тариф"; }
    public int execute(String[] params) {
        System.out.println("Редагування тарифу: функція ще не реалізована.");
        return 0;
    }
}
