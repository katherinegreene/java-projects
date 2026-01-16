public class Array_FirstUniqueElement {
    public static int DuplicatedElement(int[] array){
        

        for (int i=0 ;i <array.length;i++){// outer loop picks an element inner loop counts it
            int frequency = 0;
            for(int j =0;j<array.length;j++){
                if(array[i]==array[j]){//if  in i= j then increase frequency
                    frequency++;
                }
            }
            if(frequency>1){//when duplicate is founded return the element at the position i
                return array[i];
            }
        }
        return -1;//nothing was found return -1
    }
    public static void main(String[] args){
        int[] testArray ={1,2,3,2,4,5};
        int result =DuplicatedElement(testArray);
        if(result == -1){
            System.out.println("No duplicates");
        }else{
            System.out.println("first duplicated element is "+result);
        }
    }
}