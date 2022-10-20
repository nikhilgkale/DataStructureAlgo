package AdvancedDSA.Stacks.DoubleCharacterTrouble;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args)
    {
        System.out.println(solve("abccbc"));//ab
    }

    public static String solve(String A) {
        if(A.length() == 0 || A.length() == 1){
            return A;
        }

        Stack<Character> s = new Stack<>();
        for(int i = 0; i < A.length(); i++){
            Character a = A.charAt(i);

            if(!s.empty() && s.peek().equals(a)){
                s.pop();
            }else{
                s.push(a);
            }  
        }


        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.peek());
            s.pop();
        }
        sb.reverse();
        return sb.toString();
    }
}
