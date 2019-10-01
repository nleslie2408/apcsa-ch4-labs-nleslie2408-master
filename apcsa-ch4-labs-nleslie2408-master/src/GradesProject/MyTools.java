package GradesProject;//   MyTools.java
//
//   Name: Nathan Leslie
//
//   Enter a string and print the string out with each character on a separate line.
// ****************************************************************
import java.util.Scanner;
public class MyTools {
    /**
     *
     * @param prompt asks for an int and gives error if number is not an int
     * @return returns the number
     */
        public static int readInt(String prompt)
        {
            Scanner userInput = new Scanner(System.in);
            System.out.println(prompt);

            while(!userInput.hasNextInt())
            {
                userInput.nextLine();
                System.out.println("Error\n" + prompt);
            }

            int number = userInput.nextInt();


            return number;



        }
    public static double readDouble(String prompt)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);

        while(!userInput.hasNextDouble())
        {
            userInput.nextLine();
            System.out.println("Error\n" + prompt);
        }


        double number;
        //Calculate the distance between the two points.
        number= userInput.nextDouble();
        //Return the distance computed
        return number;
    }
    public static String readString(String prompt)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);


        String valstring = userInput.nextLine();
        //Calculate the distance between the two points.

        //Return the distance computed
        return valstring;
    }

}
