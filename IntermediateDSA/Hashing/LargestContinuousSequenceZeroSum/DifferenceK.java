package Hashing.LargestContinuousSequenceZeroSum;
import java.util.*;

public class DifferenceK {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int output = diffPossible(new int[]{11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13}, 60);
       
        System.out.println(output);
    }

    public static int diffPossible(final int[] A, int B) {

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i =A.length-1; i >= 0; i--){

            int first  = A[i];
            int second = 0;
 
            if(first>B){
                second = first - B;
            }else if(first<B){
                second = B + first;
            }
/*
            System.out.println(second);
*/
            if(first == 0){
                if(set.contains(B)){
                    return 1;
                }
            }

            if(set.contains(second)){
                return 1;
            }else{
                set.add(first);
            }
        }
        
        return 0;
    }
}
