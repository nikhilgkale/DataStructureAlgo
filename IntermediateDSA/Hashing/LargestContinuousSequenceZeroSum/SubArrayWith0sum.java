package Hashing.LargestContinuousSequenceZeroSum;
import java.util.*;

public class SubArrayWith0sum {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int output = solve(new int[]{ 862, -411, -552, -549, 918, 434, 29, -437, 121, -640, -168, -961, 929, -427, 372, 984, 488, -756, 674, -149, 945, 566, 391, -970, -44, 689, -128, -326, 43, -312, 469, 817, -349, 260, 590, -106, -700, 484, -735, -423, 660, 450, -1148, -237, -844, 62, 513, 506, 382, 77, 244, 335});

        System.out.println(output);
    }

    public static int solve(int[] A) {
        int result = 0;

        
        int[] prefixSum = new int[A.length];
        for(int i=0; i < A.length; i++){
            if(i==0){
                prefixSum[i] = A[i];
            }else{
                prefixSum[i] = prefixSum[i-1] + A[i];
            }

            //System.out.println(prefixSum[i]);

            if(prefixSum[i] == 0){
                result =1;
            }
        }

        if(result == 0){
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

            for(int i=0; i < prefixSum.length; i++){

                if(!map.containsKey(prefixSum[i])){
                    map.put(prefixSum[i], 1);
                }else{
                    map.put(prefixSum[i], map.get(prefixSum[i])+1);
                }
            }

            int count = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() %2 ==0){
                    count++;
                }else {

                    if(entry.getValue() > 2 && entry.getValue() %2 !=0){
                        count++;
                    }
                }
            }

            //System.out.println(count);

            if(count > 0){
                result = 1;
            }
        }

        return result;
    }

}
