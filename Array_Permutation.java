
/*************************************************************************************
 * Given an array of 3 characters print all permutation combinations from the
 * given characters
 *
 * Recursion LinkedHashedSet 
 * The code makes all possible letter orders by picking one letter, mixing the rest, and repeating until done.
 */
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_Permutation {
    public static void printPermutation(char[] ch) {
        for (String s : permutation(ch)) {// For each permutation (word) returned by permutation(ch), store it in s one
                                          // at a time.
            System.out.println(Arrays.toString(s.toCharArray()));// Arrays.toString(s.toCharArray()) converts a word
                                                                 // like "ABC" into a nicely printed array like [A, B,
                                                                 // C].
        }
    }

    public static Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();
        if (str.length() == 1) {// Base case: if the string has only 1 character.There is only 1 permutation
                                // possible: the character itself
            set.add(str);
        } else {
            // Recursive case: string has more than 1 character
            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {// Remove the character at index i to form the remaining substring
                                                    // Example: if str = "ABC" and i=0, then a3 = "BC"
                String a3 = str.substring(0, i) + str.substring(i + 1);// Convert the remaining substring back to char
                                                                       // array
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2)) { // Recursively find all permutations of the remaining
                                                              // characters
                    set.add(str.charAt(i) + permutation);
                    // Add the removed character (str.charAt(i)) in front of each permutation
                    // Example: 'A' + "BC" → "ABC"
                }
            }
        }
        return set;
    }
}

/*
 * Why we use LinkedHashSet
 * 
 * Set → prevents duplicate permutations
 * 
 * LinkedHashSet → preserves insertion order
 * 
 * Important if characters repeat
 * 
 * A LinkedHashSet is a special type of Set in Java:
 * 
 * Set No duplicates allowed — it automatically removes repeated values.
 * Linked Maintains insertion order — unlike a regular HashSet, the order of
 * insertion is preserved.
 * 
 * In permutation problems, we often generate permutations recursively, and
 * duplicates can appear.
 * 
 * Using a LinkedHashSet lets us:
 * 
 * Automatically remove duplicate permutations
 * 
 * Keep the permutations in the order they were generated (so output is
 * predictable)
 ** 
 * Why Sets are useful for permutation problems **
 * 
 * In permutation problems, duplicates can easily occur, especially when:
 * 
 * The input has repeated characters (e.g. {'A','A','B'})
 * 
 * Your logic generates the same permutation more than once
 * 
 * A Set automatically removes duplicates, so you don’t have to manually check.
 */