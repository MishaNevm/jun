package Ls16;

public class BankWorker extends Human {
    String bankName;

    public BankWorker(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }
    @Override
    public void showInfo() {
        System.out.println("Меня завут " + getName() + getSurName() + " Банк: " + bankName);
    }
}
