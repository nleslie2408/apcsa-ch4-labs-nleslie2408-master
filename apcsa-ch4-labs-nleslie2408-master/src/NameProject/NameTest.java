package NameProject;

import java.util.Scanner;

public class NameTest {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
      System.out.println("Please enter the name of the person #1 (first middle last): ");
      String first1 =scan.next();
      String middle1 =scan.next();
      String last1 =scan.next();
      Name person1= new Name(first1,middle1,last1);

      Scanner scan2= new Scanner(System.in);
      System.out.println("Please enter the name of the person #2 (first middle last): ");
      String first2 =scan2.next();
      String middle2 =scan2.next();
      String last2 =scan2.next();
      Name person2= new Name(first2,middle2,last2);


        System.out.println(person1.firstMiddleLast());
        System.out.println(person1.lastFirstMiddle());
        System.out.println(person1.initials());
        System.out.println("The name length is "+person1.length());
        System.out.println();

        System.out.println(person2.firstMiddleLast());
        System.out.println(person2.lastFirstMiddle());
        System.out.println(person2.initials());
        System.out.println("The name length is "+person2.length());
        System.out.println();

        if (person1.equals(person2)){
            System.out.println("The names are the same");
        }
        else{
            System.out.println("The two names are different");
        }









    }

}
