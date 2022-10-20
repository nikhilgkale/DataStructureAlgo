package Hashing.LargestContinuousSequenceZeroSum;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] output = lszero(new int[]{  -19, 8, 2, -8, 19, 5, -2, -23});
        //int[] output = lszero(new int[]{  -8, 8, -1, -16, -28, -27, 15, -14, 14, -27, -5, -6, -25, -11, 28, 29, -3, -25, 17, -25, 4, -20, 2, 1, -17, -10, -25});
        //int[] output = lszero(new int[]{ 15, -25, 10, -8, -15, 14, -11, 12, 25, 26, -15, -23, -7, -7, 20, 21, -7, -15});

        for(int i=0; i < output.length; i++){
            System.out.println(output[i]);
        }
    }

    public static int[] lszero(int[] A) {

        int[] prefixSum = new int[A.length];

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();

        for(int i=0; i < A.length; i++){
            
            if(i==0){
                prefixSum[i] = A[i];
            }else{
                prefixSum[i] = prefixSum[i-1] + A[i];
            }
        }

        for(int i=0; i < prefixSum.length; i++){
            if(!map.containsKey(prefixSum[i])){
                map.put(prefixSum[i], 1);
            }else{
                map.put(prefixSum[i], map.get(prefixSum[i])+1);
            }
        }


        int[] maxFreqIndex = new int[A.length];
        int zeroIndex = -1;
        int index =0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

             if(entry.getValue()>=2){
                maxFreqIndex[index] = entry.getKey();
                index++;
            }
        }

        int fFirstIndex  = 0;
        int fLastIndex   = 0;
        int indexLength = 0;

        for(int j =0; j < maxFreqIndex.length; j++){
            int count = 0; 
            int firstIndex  = 0;
            int lastIndex   = 0;

            for(int i=0; i < prefixSum.length; i++){

                if(prefixSum[i] == maxFreqIndex[j]){

                    if(lastIndex < i){
                        lastIndex  = i;
                    }

                    if(count == 0){
                        firstIndex = i;
                    }
                    count++;
                }

                if(indexLength < (lastIndex - firstIndex)){
                    fFirstIndex = firstIndex + 1;
                    fLastIndex  = lastIndex;
                    indexLength = lastIndex - firstIndex;
                }

                if(prefixSum[i] == 0){
                    zeroIndex = i;
                }
            }
        }

        System.out.println(fFirstIndex);
        System.out.println(fLastIndex);
        System.out.println(zeroIndex);

        if(zeroIndex >= fLastIndex-fFirstIndex)
        {
            fFirstIndex = 0;
            fLastIndex  = zeroIndex; 
        }

        int[] result = new int[fLastIndex-fFirstIndex+1];

        for(int i =fFirstIndex, j =0; i <= fLastIndex; i++, j++){
            result[j] = A[i];
        }

        return result;
    }
}
