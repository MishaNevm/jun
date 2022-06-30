package Ls20;

public class Animal implements IOtherAnimal{
    private int id = 0;
    public Animal (){}

    Animal(int id) {
        this.id = id;
    }
    public void eat (){
        System.out.println("Animal eating...");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
