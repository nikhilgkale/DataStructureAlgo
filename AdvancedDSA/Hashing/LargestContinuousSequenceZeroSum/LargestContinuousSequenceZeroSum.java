package AdvancedDSA.Hashing.LargestContinuousSequenceZeroSum;

import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {
    public static void main(String[] args)
    {
        int[] A   = new int[]{1,2,-2,4,-4};
        

        int[] output = lszero(A);
        for(int i = 0; i < output.length; i++)
            System.out.println(output[i]);  
    }
    public static int[] lszero(int[] A) {
        int n = A.length;
        
        int[] pf = new int[n];
        pf[0] = A[0];

        for(int i = 1; i < n; i++){
            pf[i]=pf[i-1]+A[i];
        }

        int answer = 0;
        int start  = -1;//to store the start index of the final answer.

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); //base case condition
        
        for(int i = 0; i < n; i++){

            if(map.containsKey(pf[i])){

                int firstIndex     = map.get(pf[i]);
                int length         = i - firstIndex;
                int previousAnswer = answer;
                answer             = Math.max(answer, length);
                if(answer>previousAnswer){
                    start=firstIndex+1;
                }
            }else{
                map.put(pf[i],i);
            }
        }
        
        //if we got a sub-array sum as 0, build a result array and return it.
        if(answer > 0){
            int[] output = new int[answer];
            int i = 0;

            while(i<answer){
                output[i] = A[start+i];
                i++;
            }
            return output;
        }
        return new int[]{};
        
    }

}
