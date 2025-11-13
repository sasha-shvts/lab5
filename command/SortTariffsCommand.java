package command;

public class SortTariffsCommand implements Command {
    public String description() { return "Відсортувати тарифи"; }
    public int execute(String[] params) {
        System.out.println("Сортування тарифів: функція ще не реалізована.");
        return 0;
    }
}
