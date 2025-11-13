package model;

import java.util.ArrayList;
import java.util.List;

public class MobileCompany {
    private String name;
    private List<Tariff> tariffs = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public MobileCompany(String name) {
        this.name = name;
    }

    public void addTariff(Tariff tariff) { tariffs.add(tariff); }
    public void removeTariff(String name) {/* ще не реалізовано */}
    public int getTotalClients() { return customers.size(); }
}
