package AdvancedDSA.Arrays;
import java.util.*;

public class MaxSumSubMatrix {
    

  // Function to find maximum continuous
  // maximum sum in the array
  static int kadane(ArrayList<Integer> al)
  {
  
    // Stores current and maximum sum
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
  
    // Traverse the array v
    for (int i = 0;
         i < (int)al.size(); i++) 
    {
  
      // Add the value of the
      // current element
      currSum += al.get(i);
  
      // Update the maximum sum
      if (currSum > maxSum)
      {
        maxSum = currSum;
      }
  
      if (currSum < 0) 
      {
        currSum = 0;
      }
    }
  
    // Return the maximum sum
    return maxSum;
  }
  
  // Function to find the maximum
  // submatrix sum
  static void maxSubmatrixSum(int [][]A)
  {
    // Store the rows and columns
    // of the matrix
    int r = A.length;
    int c = A[0].length;
  
    // Create an auxiliary matrix
    int [][]prefix = new int[r][];
  
    // Traverse the matrix, prefix
    // and initialize it will all 0s
    for (int i = 0; i < r; i++) {
  
      prefix[i] = new int[c];
      for (int j = 0; j < c; j++) {
        prefix[i][j] = 0;
      }
    }
  
    // Calculate prefix sum of all
    // rows of matrix A[][] and
    // store in matrix prefix[]
    for (int i = 0; i < r; i++) {
  
      for (int j = 0; j < c; j++) {
  
        // Update the prefix[][]
        if (j == 0)
          prefix[i][j] = A[i][j];
        else
          prefix[i][j] = A[i][j]
          + prefix[i][j - 1];
      }
    }
  
    // Store the maximum submatrix sum
    int maxSum = Integer.MIN_VALUE;
  
    // Iterate for starting column
    for (int i = 0; i < c; i++) {
  
      // Iterate for last column
      for (int j = i; j < c; j++) {
  
        // To store current array
        // elements
        ArrayList<Integer> al = new ArrayList<Integer>();
  
        // Traverse every row
        for (int k = 0; k < r; k++) {
  
          // Store the sum of the
          // kth row
          int el = 0;
  
          // Update the prefix
          // sum
          if (i == 0)
            el = prefix[k][j];
          else
            el = prefix[k][j]
            - prefix[k][i - 1];
  
          // Push it in a vector
          al.add(el);
        }
  
        // Update the maximum
        // overall sum
        maxSum = Math.max(maxSum, kadane(al));
      }
    }
  
    // Print the answer
    System.out.print(maxSum+ "\n");
  }
  
  // Driver Code
  public static void main(String[] args)
  {
    /* 
    int [][]matrix = { { 0, -2, -7, 0 },
                      { 9, 2, -6, 2 },
                      { -4, 1, -4, 1 },
                      { -1, 8, 0, -2 } };
  
  int [][]matrix = { {-17, - 2},
                     {20, 10}};*/

  int [][]matrix = { {-6, -6},
                     {-29,-8},
                     {3,-8},
                     {-15,2},
                     {25,25},
                     {20, -5}};

    // Function Call
    maxSubmatrixSum(matrix);
  }
}
  
// This code is contributed by 29AjayKumar