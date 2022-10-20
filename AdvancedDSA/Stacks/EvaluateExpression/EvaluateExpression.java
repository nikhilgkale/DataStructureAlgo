package AdvancedDSA.Stacks.EvaluateExpression;

import java.util.Stack;

public class EvaluateExpression {
    
    public static void main(String[] args)
    {
        System.out.println(evalRPN(new String[]{"2", "2", "/"}));  
    }

    public static int evalRPN(String[] A) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < A.length; i++){
            if(A[i] == "+" || A[i] == "-" || A[i] == "*" || A[i] == "/"){
                int x = Integer.parseInt(stack.pop());
                int y = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(evaluate(x,y,A[i])));
            }else{
                stack.push(A[i]);
            }
        }

        return Integer.parseInt(stack.pop());
    }

    private static int evaluate(int A, int B, String operator){

        switch(operator) {
            case "+" :
                return A+B;
            case "-" :
                return A-B;
            case "*" :
                return A*B;
            case "/" :
                return A/B;
            default :
                return 1;
        }
    }
}
