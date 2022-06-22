package Ls15;

public class User extends Prifile{
    private String name;
    @Override
    public void setInfo (){
        System.out.print("Введите Ваше имя: ");
        name = scan.nextLine();
    }
    public String getName(){
        return name;
    }
}
