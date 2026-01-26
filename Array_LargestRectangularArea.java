    /******
    Largest Rectangular Area in a Histogram
    Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of
    a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

    For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}.
     The largest possible rectangle possible is 12
     */

    //this solution uses a brute force/dinamic approach:
    //it examines every possible subarray of bars
    //for each sub array it teacjs min height and computes area 
     public class Array_LargestRectangularArea {

    // Method to find largest rectangular area in a histogram (brute-force / dynamic approach)
    public static int Array_LargestRectangularArea(int[] arr) {
        int n = arr.length;
        int[][] temp = new int[n][n];
        int max = arr[0];

        // width of subarray
        for (int w = 1; w <= n; w++) {
            for (int l = 0; l <= n - w; l++) {
                int r = l + w - 1; // right index

                if (w == 1) {
                    temp[l][l] = arr[l]; // single bar
                    max = Math.max(max, temp[l][l]);
                } else {
                    // minimum height in subarray [l..r]
                    temp[l][r] = Math.min(temp[l][r - 1], arr[r]);
                    max = Math.max(max, temp[l][r] * w); // area = min height * width
                }
            }
        }

        return max;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] histogram = {6, 2, 5, 4, 5, 1, 6};

        int maxArea = largestRectangleArea(histogram);

        System.out.println("Largest Rectangular Area: " + maxArea);
    }
}
