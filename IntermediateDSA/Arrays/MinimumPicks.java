package Arrays;
import java.lang.*;

public class MinimumPicks {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(new int[]{ 74, 11, 9, 51, 51, 75, 0, 35, 89, 96, 77 }));
    }

    public static int solve(int[] A) {
    
        int max = (int) - Math.pow(10,9);
        int min = (int) Math.pow(10,9);

        for(int i=0; i < A.length; i++){
            if(A[i]%2 ==0){
                if(max < A[i]){ 
                    max = A[i];
                }
            }else{

                if(min > A[i]){ 
                    min = A[i];
                    System.out.println("Min :" + min);
                }
            }
            
        }

        System.out.println("Max :" + max);
        //System.out.println("Min :" + min);
        return max-min;
        
    }
}
