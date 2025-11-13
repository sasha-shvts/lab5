package command;

public class SaveCommand implements Command {
    public String description() { return "Зберегти дані у файл"; }
    public int execute(String[] params) {
        System.out.println("Збереження: функція ще не реалізована.");
        return 0;
    }
}
