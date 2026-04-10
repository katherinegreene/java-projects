class String_UniqueCharacters{
    
    /*
        Write a return method that can find the unique characters from the String
                Ex: unique("AAABBBCCCDEF") ==> "DEF";

        */
    public static String unique(String str){
        String[] arr = str.split("");
        String unique1 ="";
        for(int i = 0;i<str.length();i++){ //.length()-1
            int num =0;
            for(int k=0;k<str.length();k++){//.length()
                if(str.charAt(i)==str.charAt(k)){
                     num++;}
             
                        
            }
            if(num ==1){
                unique1 += str.charAt(i);
            }
        }
        return unique1;
     }
         public static void main(String[] args){
        String input = "AAABBBCCCDEF";
        String result = String_UniqueCharacters.unique(input);
        System.out.println(result);

    }
    
}

