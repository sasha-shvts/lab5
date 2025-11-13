package model;

public abstract class Tariff {
    private String name;
    private double monthlyFee;
    private int minutes;
    private int megabytes;
    private int sms;
    private int clients;

    public Tariff(String name, double monthlyFee, int minutes, int megabytes, int sms, int clients) {
        this.name = name;
        this.monthlyFee = monthlyFee;
        this.minutes = minutes;
        this.megabytes = megabytes;
        this.sms = sms;
        this.clients = clients;
    }

    public String getName() { return name; }
    public double getMonthlyFee() { return monthlyFee; }
    public int getMinutes() { return minutes; }
    public int getMegabytes() { return megabytes; }
    public int getSms() { return sms; }
    public int getClients() { return clients; }

    public abstract double getAnnualCost();
}
