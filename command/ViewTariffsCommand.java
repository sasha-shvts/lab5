package command;

public class ViewTariffsCommand implements Command {
    public String description() { return "Переглянути тарифи"; }
    public int execute(String[] params) {
        System.out.println("Перегляд тарифів: функція ще не реалізована.");
        return 0;
    }
}
