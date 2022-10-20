package AdvancedDSA.Queue.TaskScheduling;

import java.util.*;

public class TaskScheduling {

    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{2,3,1,5,4}, new int[]{1,3,5,4,2}));  
    }

    public static int solve(int[] A, int[] B) {
        int output = 0;

        Queue<Integer> queue = new LinkedList<Integer>(); 
        
        for(int i = 0; i < A.length; i++){
            queue.add(A[i]);
        }

        for(int i = 0; i < B.length; i++){
            while(!queue.isEmpty()){
                int curr = queue.poll();
                
                if(curr == B[i]){
                    output++;
                    break;
                }else{
                    queue.add(curr);
                    output++;
                }
                
            }
        }
        return output;
    }
}
