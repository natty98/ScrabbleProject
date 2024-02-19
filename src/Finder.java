import java.util.HashMap;

public class Finder {
    /**
     * This method is used to find the possible words that the user could use and also display their values beside them
     * @param letter - repressents the letter the player wants to play against
     * @param availLetters - represents the letters available to the player(7)
     * 
     * returns a string that contains the 
     */
    public static String Find(String letter, String availLetters){
        /*Check the words in the scrabble dictionary that have those words */
        /*Display both the words and their value */
        int value = 0;
        String v = "";
        String word = "";
        //search what words have the available letters in them and select those
        //return these words to the user
        //the scrabble dictionary should have the words sorted by their different number of letters

        // Contains the value associated with the tile which can then be used to calculate the score
        HashMap<String,Integer> tile = new HashMap<>();

        tile.put("A",1);
        tile.put("B",3);
        tile.put("C",3);
        tile.put("D",2);
        tile.put("E",1);
        tile.put("F",4);
        tile.put("G",2);
        tile.put("H",4);
        tile.put("I",1);
        tile.put("J",8);
        tile.put("K",5);
        tile.put("L",1);
        tile.put("M",3);
        tile.put("N",1);
        tile.put("O",1);
        tile.put("P",3);
        tile.put("Q",10);
        tile.put("R",1);
        tile.put("S",1);
        tile.put("T",1);
        tile.put("U",1);
        tile.put("V",4);
        tile.put("W",4);
        tile.put("X",8);
        tile.put("Y",4);
        tile.put("Z",10);
        tile.put("?", 0);

        return "";
    }

    public static void main(String[] args){

    }
}
