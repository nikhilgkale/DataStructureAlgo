package AdvancedDSA.Stacks.SortStackUsingAnotherStack;

import java.util.*;

public class SortStackUsingAnotherStack {
    public static void main(String[] args)
    {
        System.out.println();//5,6,4,3,2,1
        int[] op = solve(new int[]{66, 96, 43, 28, 14, 1, 41, 76, 70, 81, 22, 11, 42, 78, 4, 88, 70, 43, 90, 6, 12 });
        for(int i =0; i < op.length; i++){
            System.out.print(op[i] + ",");
        }
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int[] ouput = new int[n];

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for(int i =0; i < n; i++){
            s1.push(A[i]);
        }

        while(!s1.isEmpty()){

            int temp = s1.pop();

            while(!s2.isEmpty() && s2.peek() > temp){
                s1.push(s2.pop());
            }
            s2.push(temp);
        }

        for(int i =0; i < s2.size(); i++){
            ouput[i] = s2.get(i);
        }

        return ouput;
    }
}
