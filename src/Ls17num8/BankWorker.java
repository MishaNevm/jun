package Ls17num8;

public class BankWorker extends Human {
    String bankName;

    public BankWorker(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String getInfo() {
        return name + " " + surname + " банк " + bankName;
    }
}
