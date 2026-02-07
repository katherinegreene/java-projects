   /*
    Word Break Problem//simple answer
    Given an input string and a dictionary of words, find out if the input string can be segmented
    into a space-separated sequence of dictionary words. See following examples for more details.
    This is a famous Google interview question, also being asked by many other companies now a days.
    Consider the following dictionary
        { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
        Input:  ilike
        Output: Yes
        The string can be segmented as "i like".

        Input:  ilikesamsung
        Output: Yes
        The string can be segmented as "i like samsung" or "i like sam sung".
     */
import java.util.Arrays;
import java.util.ArrayList;

public class Array_WordBreakProblem{
        public static void main(String[] args){
        //create string array
        String[] dictionary = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};

        String input = "ilikesamsung";

        //creates an empty list to store found words:
        ArrayList<String> words = new ArrayList<>();
        // goes over all substrings using 2 for loops
            for (int i = 0; i < input.length(); i++) {
                for (int j = i; j < input.length(); j++) {
                    String temp = input.substring(i, j+1);//for each pair (i, j), temp is the substring from index i to j (inclusive).

              //*If temp is one of the dictionary words,And it’s not already in words,Then add it to words. */
                if(Arrays.asList(dictionary).contains(temp) ){
                    if(!words.contains(temp)) {
                        words.add(temp);
                    }
                }
                }
            }
            String result = (words.size()>0)? "YES":"NO";//If at least one dictionary word was found in the string, result becomes "YES".
    }
}
