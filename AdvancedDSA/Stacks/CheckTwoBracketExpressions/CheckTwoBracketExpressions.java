package AdvancedDSA.Stacks.CheckTwoBracketExpressions;

import java.util.Stack;

public class CheckTwoBracketExpressions {
    public static void main(String[] args)
    {
        System.out.println(solve("-(a+b+c)", "-a-b+c"));
    }

    public static int solve(String A, String B) {
        int[] first  = eval(A);
        int[] second = eval(B);

        for(int i=0; i<26; i++)
            if(first[i] != second[i])//Exit on any single missmatch
                return 0;
        return 1;
    }

    private static int[] eval(String str){
        int[] ans            = new int[26];
        Stack<Boolean> stack = new Stack<>();
        stack.push(true);//default sign is positive

        for(int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);

            if(c == '+' || c == '-'){//skip local sign until alphabet is found
                continue;
            }

            if(c == '(' && i>0){//push next global sign
                if(str.charAt(i-1) == '-'){
                    stack.push(!stack.peek());
                }else{
                    stack.push(stack.peek());
                }
                continue;
            }

            if(c>='a' && c <= 'z'){//evaluating alphabets
                if(i>0 && str.charAt(i-1) == '-'){
                    ans[c-'a'] = (stack.peek()?-1:1);
                }else{
                    ans[c-'a'] = (stack.peek()?1:-1);
                }
                continue;
            }

            if(c==')'){//end of previous global sign, hence pop it.
                stack.pop();
            }
        }
        return ans;
    }
}
