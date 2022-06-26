package Ls17num8;

public class Client extends Human{
    private String bankName;
    public Client (String name, String surname, String bankName){
        super (name, surname);
        this.bankName = bankName;
    }
    public String getInfo () {
        return name + " " + surname + " банк " + bankName;
    }

}
