package BandProject;

import GradesProject.MyTools;

import java.util.jar.JarOutputStream;

public class BandTester {
    public static void main(String[] args) {
        String booster1Name = MyTools.readString("Enter booster 1's name:");
        String booster2Name = MyTools.readString("Enter booster 2's name:");
        BandBooster b1 = new BandBooster(booster1Name);
        BandBooster b2 = new BandBooster(booster2Name);

    for(int i=0; i<3; i++) {
        b1.updateSales(MyTools.readInt("Enter sales for " + b1.getName() + " for week " + (i + 1) + ": "));


    }
    for(int i=0; i<3; i++) {
        b2.updateSales(MyTools.readInt("Enter sales for " + b2.getName() + " for week " + (i + 1) + ": "));
    }
        System.out.println(b1.getName()+ " sold "+ b1.getBoxesSold());
        System.out.println(b2.getName()+ " sold "+ b2.getBoxesSold());



    }
}
