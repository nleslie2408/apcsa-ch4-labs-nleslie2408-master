package BandProject;

public class BandBooster {
    //TODO 1 Instance Data
    private int boxesSold;
    private String name;

    //TODO 1a Constructor(s)

    public BandBooster(String Bandname){
        name = Bandname;
        boxesSold = 0;

        }

    //TODO 1b get Name

     public String getName(){
        return name;
     }

    //TODO 1c updateSales
    //precondition: newSales >= 0
    public int updateSales(int newSales){
        if(newSales < 0){
            System.out.println("Error updateSales must be passed a positive parameter");
            return this.boxesSold;
        }
        this.boxesSold += newSales;
        return this.boxesSold;
    }


    //TODO 1d toString
    public String toString() {
        return "Name: "+ name + "\tBoxes Sold: " +boxesSold;
    }


    public int getBoxesSold() {
        return this.boxesSold;
    }
}
