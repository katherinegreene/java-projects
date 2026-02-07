import java.util.*;

public class Array_WordBreakProblem02 {

    // main method is required, and all executable code must be inside it
    public static void main(String[] args) {

        String[] dictionary = {
                "i", "like", "sam", "sung", "samsung",
                "mobile", "ice", "cream", "icecream",
                "man", "go", "mango"
        };

        String input1 = "ilike";
        String input2 = "ilikesamsung";
        String input3 = "zzzi";

        System.out.println(input1 + " -> " + wordBreak(input1, Arrays.asList(dictionary)));
        System.out.println(input2 + " -> " + wordBreak(input2, Arrays.asList(dictionary)));
        System.out.println(input3 + " -> " + wordBreak(input3, Arrays.asList(dictionary)));
    }

    // Word Break: returns true if the entire string s
    // can be separated into words from wordDict
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);

        // dp[i] == true means s[0..i-1] can be segmented
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // empty string is segmentable

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}

/*Explanation
We have a big string: for example "ilikesamsung".

We also have a dictionary of words: "i", "like", "sam", "sung", "samsung", etc.

The question is: “Can I cut the big string into pieces so that every piece is a word in the dictionary, with no extra letters left?” 
"ilike" → you can cut it as "i" + "like" → both are in the dictionary → answer: YES.

"zzzi"  the dictionary maybe has "i", but "zzz" is not a word → you cannot cover the whole string answer: NO.*/


/* wordBreak method uses dynamic programming where dp[i] means "first i characters can be split  into dictionary words
it starts with dp[0]=true (empty string also works), 
then for each ending position i, the inner loop tries all split points j before i to check if the left part s[0..j-1] is already segmentable 
(dp[j]==true) AND the right part s[j..i-1] is a dictionary word (checked via fast HashSet.contains()) if both are true, it marks dp[i]=true and breaks early
finally return dp[s.length()] tells if the entire string works, with HashSet used instead of List for O(1) word lookups instead of slow linear search. */