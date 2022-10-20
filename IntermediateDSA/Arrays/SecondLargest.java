package Arrays;
import java.util.*;
public class SecondLargest {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(new int[]{ 814, 761, 697, 483, 981  }));
    }

    public static int solve(int[] A) {

        if(A.length == 1){
            return -1;
        }else{

            int max   = 0;
            int index = 0;

            for(int i=0; i < A.length; i++){
                if(max < A[i]){
                    max = A[i];
                    index = i;
                }
            }
            int[] anotherArray = new int[A.length - 1];
 
            System.arraycopy(A, 0, anotherArray, 0, index);
 
            System.arraycopy(A, index + 1,
                            anotherArray, index,
                        A.length - index - 1);

            max = 0;
            for(int i=0; i < anotherArray.length; i++){
                if(max < anotherArray[i]){
                    max = anotherArray[i];
                }
            }
            return max;
        }
    }
}
