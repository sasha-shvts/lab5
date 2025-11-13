package command;

public class LoadCommand implements Command {
    public String description() { return "Завантажити дані з файлу"; }
    public int execute(String[] params) {
        System.out.println("Завантаження: функція ще не реалізована.");
        return 0;
    }
}
