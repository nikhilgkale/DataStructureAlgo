package AdvancedDSA.Stacks.BalancedParanthesis;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args)
    {
        System.out.println(solve("))))))))"));//"{([])}"));  
    }

    public static int solve(String A) {
        if(A.length()%2 != 0) return 0;

        Stack<Character> s = new Stack<>();

        for(int i =0; i < A.length(); i++){
            if(A.charAt(i)== '{' || A.charAt(i)== '(' || A.charAt(i) == '['){
                s.push(A.charAt(i));
            }else if(A.charAt(i)== '}' && !s.isEmpty() && s.peek() == '{'){
                s.pop();
            }
            else if(A.charAt(i)== ')' && !s.isEmpty() && s.peek() == '('){
                s.pop();
            }
            else if(A.charAt(i)== ']' && !s.isEmpty() && s.peek() == '['){
                s.pop();
            }
            else{
                return 0;
            }
        }

        if(s.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}
