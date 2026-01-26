    /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};

write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five

     */

import java.util.LinkedHashMap;
import java.util.Map;

public class Array_FrequencyOfEachElement_WithWord {

    // Method to convert numbers to words for 1-10
    public static String numberToWord(int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            default: return String.valueOf(number); // fallback
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4};

        // LinkedHashMap to maintain insertion order
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the results in the required format
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            System.out.println(number + " is " + numberToWord(count));
        }
    }
}
