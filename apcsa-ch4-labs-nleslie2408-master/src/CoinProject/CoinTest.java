package CoinProject;

/**
 * Name:
 *
 * CoinTest.java
 *
 * Finds the length of the longest run of heads in 100 flips of a coin.
 */
public class CoinTest
{
    public static void main (String[] args)
    {
        final int FLIPS = 100; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far

        // TODO #1: Create a coin object
        Coin c= new Coin();

        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            // TODO #2a: Flip the coin & print the result
            c.flip();
            //System.out.println(c.toString()); This is an explicit toString call
            //Below is an implicit toString call
            System.out.println(c);
            // TODO #2b: Update the run information
           if(c.isHeads()){
               currentRun++;
               // Update the maximum run
               if(currentRun > maxRun){
                   maxRun = currentRun;
               }

           }
           else{
               currentRun = 0;
           }
        }

        // TODO #3: Print the results of the longest run
        System.out.println("The maximum run of HEADS was "+ maxRun);
    }
}