package Arrays;
import java.util.*;

public class MultipleLeftRotationOfTheArray {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[][] output = solve(new int[]{1,2,3,4,5 }, new int[]{2,3});
        
        for(int i = 0; i < 2; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                System.out.print(output[i][j]);
            }
        }
    }

    public static int[][] solve(int[] A, int[] B) {

        int n = A.length;
        int[][] output = new int[B.length][n];

        for(int i = 0; i < B.length; i++){

            int[] temp = new int[n];
            System.arraycopy(A, 0, temp, 0, n);

            int k = B[i];
            if(k > n){
                k = k%n;
            }

            System.out.println(k);

            reverse(temp, 0, n-1);
            reverse(temp, 0, n-k-1);
            reverse(temp, n-k, n-1);

            for(int j = 0; j < n; j++){
                output[i][j] = temp[j];

                System.out.print(temp[j]);
                //System.out.println(output[i][j]);
            }
            Arrays.fill(temp, 0);
        }

        return output;
    }

    private static void reverse(int[] arr, int s, int e){

        int i = s;
        int j = e;

        while(i<j){

            arr[i] =  arr[i] + arr[j];
            arr[j] =  arr[i] - arr[j];
            arr[i] =  arr[i] - arr[j];

            i++;
            j--;
        }

    }
}
