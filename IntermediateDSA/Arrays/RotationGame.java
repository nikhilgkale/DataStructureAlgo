package Arrays;

import java.util.*;

public class RotationGame {

    public static void main(String[] args) {
       
                       // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
        try (
            Scanner sc  = new Scanner(System.in)) {
            int n       = sc.nextInt();

            /*
            if(!(n>=1 && n<= 1000000)){
                return;
            }
            */
            int[] array = new int[n];  
             
            for(int i=0; i<n; i++)  
            {  
                array[i]=sc.nextInt();  
            }  

            int B = sc.nextInt();

            sc.close();

            if(B>n){
                B = B%n;
            }

            int i = 0; int j = n-1;

            while(i<j)   
            {
                swap(array,i,j);
                i++;
                j--;
            }

            i = 0; j = B-1;
            while(i<j)   
            {
                swap(array, i,j);
                i++;
                j--;
            }

            i = B; j = n-1;
            while(i<j)   
            {
                swap(array, i, j);
                i++;
                j--;
            }
             
            for (int k=0; k<n; k++)   
            {  
                System.out.print(array[k] + " ");  
            }
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }  
    }
    

    private static void swap(int[] arr, int start, int end){
        arr[start] = arr[start] + arr[end];
        arr[end]   = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
    }
}
