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
    public static void main(String[] args){
        String[] testArray = {"Apple","Banana","Apple","Cherry"};

        //solution 1 use MAP
        Map<String,Integer> map = new LinkedHashMap<>();
            for(String i = 0;i<testArray.length;i++){
                int frequency  =0;
                for(String j= 0;j<testArray.length;i++){
                    if(i.eaquals(j)){
                        frequency++;
                    }
                }
                map.put(each,frequency);
            }
            for(Map.Entry<String,Integer> entry:map.entrySet()){//ıdk about entry or what map does I dk inside the for looop ı also dont get: notation
                System.out.println(entry);
            }
            
        

    }
}