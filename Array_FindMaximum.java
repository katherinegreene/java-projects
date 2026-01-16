/*
        Write a function that can find the maximum number from an int Array
     */

     public class Array_FindMaximum{
        public static int maxVal(int[]n){
            int max =Integer.MIN_VALUE;
            for (int each :n){
                if(each>max){
                    max =each;
                }
            } 
            
            return max;
           
        }
     }