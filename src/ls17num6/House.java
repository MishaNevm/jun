package ls17num6;

public class House {
    private int floors;
    private int buildingYear;
    private String name;
    public void setInfo (int floors, int buildingYear, String name){
        this.floors = floors;
        this.buildingYear = buildingYear;
        this.name = name;
    }
    public String getInfo (){
        return floors + "\n" + buildingYear + "\n" + name;
    }
}
