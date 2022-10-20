package Hashing;
import java.util.*;

public class DistinctNumbersInWindow {
    
    public static void main(String[] args) {
        System.out.println("Hello World");


        int[] array = dNums(new int[]{1, 2, 1, 3, 4, 3 }, 3);

        for(int i =0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] dNums(int[] A, int B) {

        int N = A.length;
        //System.out.println(A.length);

        if(B>N){
            return new int[]{};
        }

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();

        for(int i =0; i< B; i++){
            //System.out.println(A[i]);
            if(!map.containsKey(A[i])){
                map.put(A[i],1);
            }else{
                map.put(A[i], map.get(A[i]) +1);
            }
            
        }

        int [] array = new int[N-B+1];
        int index    = 0;
        array[index] = map.size();
        index++;
        int j = B;

        for(int i = 1; i<= N-B; i++){
            
            //System.out.println(A[j]);
            map.put(A[i-1], map.get(A[i-1])-1);

            if(map.get(A[i-1]) == 0){
                map.remove(A[i-1]);
            }

            if(!map.containsKey(A[j])){
                map.put(A[j],1);
            }else{
                map.put(A[j], map.get(A[j])+1);
            }
            
            array[index] = map.size();
            j++;
            index++;
        }

        return array;
    }
}
