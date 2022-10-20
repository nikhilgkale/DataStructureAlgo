package Hashing;
import java.util.*;

public class PairsWithGivenXor {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String s = "589  ";
        char[] ch = s.toCharArray();

        int[] ints1 = s.chars()
            .map(x -> (x==' ')?0:x-'0')
            .toArray();

        for(int i = 0; i <ints1.length; i++){
            //System.out.println(ch[i]);
            System.out.println(ints1[i]);
        }

        int output = solve(new int[]{13, 10, 12, 8, 14, 17, 20, 15, 6, 7, 16, 5, 21, 18, 9, 11, 19}, 2);
       
        System.out.println(output);
    }
    public static int solve(int[] A, int B) {

        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        
        for(int i = 0; i <A.length; i++){

            if(!set.contains(A[i])){
                int xor = A[i] ^ B;
                set.add(xor);
            }else{
                count++;
            }
        }
        
        return count;
    }
}
