public class IntegerN{
    /*Write a program  that displays the smallest integer n such that n^2 > 12,000 and displays the largest integer n such that n^3  < 12,000. */
    public static void main(String args[]){
        System.out.println(Math.pow(2,5));
        int n =0;
        while(n*n>12000){
            n++;
        }
    System.out.println(n+"smallest integer n such that n^2 > 12,000");
        n=0; 
        while(n*n*n<12000){
            n++; 
        }
        n--;
    System.out.println(n+"largest integer n such that n^3  < 12,000");
    }
}