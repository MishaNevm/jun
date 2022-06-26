package Ls17num8;

public class Ls17num8 {
    public static void main(String[] args) {
        Client one = new Client("Misha", "Nevmerzhitskii", "Tinkoff");
        BankWorker two = new BankWorker("Anya", "Pytlova", "Tinkoff");
        System.out.println(one.getInfo());
        System.out.println(two.getInfo());
    }
}
