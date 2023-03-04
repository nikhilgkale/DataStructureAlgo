package Sorting.NobleInteger;
import java.util.Arrays;

//Noble Integer -The no of elements less than A[i] should be equal to A[i]
//e.g. {1,5,2, -1} - here 1 & 2 are noble integer - count=2
//e.g. Non repeated {1,5,1,3, -1} - here 1,1 & 3 are noble integer - count=3
public class NobleInteger {
    public static void main(String[] args) {
        
        System.out.println("Noble Integer Count in array : " + CountNobleIntegers(new int[]{ 1,5,2, -1}));
        System.out.println("Noble Integer Count in repeated element array : " + CountNobleIntegersInRepeatedArray(new int[]{ 1,5,1,3, -1}));
    }
     
    private static int CountNobleIntegers(int[] A){
        int count = 0;

        Arrays.sort(A);

        for(int i = 0; i < A.length; i++){
            if(A[i] == i){
                count += 1;
            }
        }

        return count;
    }

    private static int CountNobleIntegersInRepeatedArray(int[] A){
        int count = 0;
        int temp  = 0;
        Arrays.sort(A);

        for(int i = 0; i < A.length; i++){

            if(i > 0 && A[i] != A[i-1]){
                temp = i;
                if(A[i] == i){
                    count += 1;
                }
            }
            else{
                if(A[i] == temp){
                    count += 1;
                }
            }
        }

        return count;
    }
}
