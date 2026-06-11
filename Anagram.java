public class Anagram{
public static void main(String[] args){
    System.out.println(isAnagram("anagram","gramana"));
}
    public static boolean isAnagram(String s,String t){
        //take strings as arrays traverse through letters compare two arrays with each other maybe crate each array in a way that will store all the characters
        int[] count = new int[26];//empty array

        if (s.length()==t.length()){
        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for (int k=0;k<t.length();k++){
            count[t.charAt(k)-'a']--;

        }
         for (int j=0 ; j<26;j++){
            if( count [j]!=0)
                return false;
            };

    return true;
    }
     return false;
    }

//The idea is: Add 1 for each character in s. Subtract 1 for each character in t.If s and t are anagrams, then every character appears exactly as many times in both strings, so all counts should end at 
}