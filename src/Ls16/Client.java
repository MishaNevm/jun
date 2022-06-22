package Ls16;

public class Client extends Human {
    String bankName;

    public Client(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }

    @Override
    public void showInfo() {
        System.out.println("Меня завут " + getName() + getSurName() + " Банк: " + bankName);
    }
}
