package AdvancedDSA.Stacks.RedundantBraces;

import java.util.Stack;

public class RedundantBraces {

    public static void main(String[] args)
    {
        System.out.println(braces("((a+b))"));//(a+(a+b))
    }

    public static int braces(String A) {
        if(A.length() == 0) return 0;

        Stack<Character> s = new Stack<>();

        for(int i =0; i < A.length(); i++){
            Character a = A.charAt(i);
            if(a == '(' || a == '+' || a == '-' || a == '*' || a == '/'){
               s.push(a);
            }

            if(a == ')'){
                int count = 0;
                while(s.peek() != '('){
                    count++;
                    s.pop();
                }
                s.pop();

                if(count==0){
                    return 1;
                }
            }
        }
        return 0;
    }
}
