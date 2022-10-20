package AdvancedDSA.Stacks.InfixToPostfix;

import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args)
    {
        System.out.println(solve("a+b*(c^d-e)^(f+g*h)-i"));  
    }
    public static String solve(String A) {
        Stack<Character> stack = new Stack<>();
      StringBuilder sb = new StringBuilder();
 
      for(int i=0;i<A.length();i++){

          char ch = A.charAt(i);
          if(ch >='a' && ch <='z')
              sb.append(ch);
          else{

              if(stack.isEmpty() || ch == '(')
                  stack.push(ch);
              else{
                  if(ch == ')'){
                      while(!stack.isEmpty() && stack.peek() != '(')
                          sb.append(stack.pop());    
                      stack.pop();
                  }
                  else{
                      while(!stack.isEmpty() && stack.peek()!='(' && checkPriority(stack.peek()) >=
                                                                   checkPriority(ch))
                          sb.append(stack.pop());
                      stack.push(ch);
                  }
              }
          }
      }
      while(!stack.isEmpty())
          sb.append(stack.pop());
      return sb.toString();
  }
  public static int checkPriority(char op){

      if(op == '^')
          return 3;
      else if(op == '/' || op == '*')
          return 2;
      return 1;
  }
}
