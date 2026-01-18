/*
    write a program that can move all the zeros to the end of an array
     */

public class Array_MoveAllZerosToTheEnd {
    public static void MoveAllZeros(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }

        }
        while (count < arr.length) {
            arr[count++] = 0;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 3, 0, 3, 2, 0, 2, 3, 3 };
        MoveAllZeros(arr);
    }

}