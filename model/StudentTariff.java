package model;

public class StudentTariff extends Tariff {
    private int freeNightMinutes;

    public StudentTariff(String name, double monthlyFee, int minutes, int megabytes, int sms, int clients, int freeNightMinutes) {
        super(name, monthlyFee, minutes, megabytes, sms, clients);
        this.freeNightMinutes = freeNightMinutes;
    }

    @Override
    public double getAnnualCost() {
        return getMonthlyFee() * 12;
    }
}
