package Ls17num8;

public abstract class Human {
    protected String name;
    protected String surname;
    public Human (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    public abstract String getInfo();

}
