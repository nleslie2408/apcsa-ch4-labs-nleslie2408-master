package CoinProject;

/**
 * Name:
 *
 * Coin.java
 *
 * Represents a coin with two sides that can be flipped
 */
public class Coin {

    //Instance Variables
    public final int HEADS = 0;
    public final int TAILS = 1;
    private int face;

    /**
     * Default constructor for a coin object
     */
    public Coin() {
        flip();
    }

    /**
     * Randomly sets the face of the coin
     */
    void flip() {
        face = (int) (Math.random() * 2);
    }

    /**
     * Returns true if the current face of the coin is heads.
     *
     * @return true if the current face of the coin is heads, false otherwise.
     */
    public boolean isHeads() {

        return (face == HEADS);
    }

    /**
     * Returns the current face of the coin as a string .
     *
     * @return the current face of the coin as a string .
     */
    public String toString() {
        String faceName;
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";

        return faceName;
    }
}