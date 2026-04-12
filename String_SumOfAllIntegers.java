import java.util.Scanner;
public class String_SumOfAllIntegers{
    public static int getSumOfNumbers(String string){
        /*
        return the sum of all integers found in the parameter String
        */

                    /*
                    Please implement this method to
                    return the sum of all integers found in the parameter String.
                    You can assume that integers are separated from other parts with one or more spaces (' ' symbol).

                    For example, s="12 some text 3 7", result: 22 (12+3+7=22)
                */
            int sum =0;
            String[] numbers = string.replaceAll("[\\D]+"," ").trim().split(" ");
            
        
        for(String each: numbers){
            sum+=Integer.parseInt(each);

        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//
        System.out.println("Enter numbers with some text such as  text 2 13");
        String input = scanner.nextLine();
        int result = getSumOfNumbers(input);
        System.out.println("The sum is"+result);
    }

}










//Notes
/*
Pro-Tip: When you see a task asking for "sum of numbers in a String," 
 think: Clean (Regex) -> Break (Split) -> Convert (Parse) -> Add (Sum).
The Concept: Regex is a sequence of characters that forms a search pattern.

Why it's in the answer: s.replaceAll("[\\D]+"," ") uses Regex. \\D means "any character that is NOT a digit." It basically scrubs away all the words and symbols, replacing them with spaces so only numbers remain.

The Concept: Integer.parseInt().

Why it's in the answer: Computers see "12" (the String) and 12 (the number) as completely different things. You cannot perform math on a String. parseInt "parses" or converts the text into a mathematical integer so you can add it to your sum.

The Concept: The .split(" ") method breaks a single long string into an array of smaller strings based on a "delimiter" (in this case, a space).

Why it matters: It turns "12 3 7" into ["12", "3", "7"], allowing you to look at each number one by one
The Concept: for(String each : numbers) is a "For-Each" loop.

Why it matters: It is much cleaner when you just need to grab every item in an array. It says: "For every String (which we will call 'each') inside the 'numbers' array, do the following..
*/