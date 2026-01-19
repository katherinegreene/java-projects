
/*
Given the array return the output
            testArray = {"Apple","Banana","Apple","Cherry"}
            Output Example
            Apple = 2
            Banana = 1
            Cherry = 1
 */
import java.lang.reflect.Array;
import java.util.*;

public class Array_FrequencyOfEachElement {
    public static void main(String[] args) {
        String[] testArray = { "Apple", "Banana", "Apple", "Cherry" };

        // solution 1 use MAP
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : testArray) { // for each string in test array.each → will take the value of one string at a
                                        // time from the array

            int frequency = 0;
            for (String s : testArray) {
                if (each.equals(s)) {// Is this element s the same as each? If yes, increment the frequency
                    frequency++;
                }
            }
            map.put(each, frequency);// map.put(key, value) adds the key-value pair to the map.Example:
                                     // map.put("Apple", 2) → now the map knows that Apple occurs 2 times.
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {// prints the map
            System.out.println(entry);
        } /*
           * map.entrySet() gives a set of all key-value pairs in the map.
           * Map.Entry<String, Integer> entry → represents one key-value pair.
           * System.out.println(entry) prints it
           */

    }
}

/*
 * Notes
 * A Map stores key-value pairs.
 * 
 * Key → the thing you are counting (here, the string like "Apple")
 * 
 * Value → the number of times it occurs (here, an Integer)
 * 
 * LinkedHashMap is used instead of HashMap so the order of insertion is
 * preserved (so it prints Apple, Banana, Cherry in the original order)
 * First each = "Apple"
 * 
 * Counting frequency (inner loop) Loops over all elements:
 * 
 * "Apple".equals("Apple") → true → frequency = 1
 * 
 * "Apple".equals("Banana") → false → frequency stays 1
 * 
 * "Apple".equals("Apple") → true → frequency = 2
 * 
 * "Apple".equals("Cherry") → false → frequency stays 2
 */
