package command;

public class CountClientsCommand implements Command {
    public String description() { return "Підрахувати клієнтів"; }
    public int execute(String[] params) {
        System.out.println("Підрахунок клієнтів: функція ще не реалізована.");
        return 0;
    }
}
