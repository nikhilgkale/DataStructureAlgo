package AdvancedDSA.Queue.FirstNonRepeatingCharacter;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args){
        System.out.println(solve("ier")); //abcabc //iergxwhddh
    }

    public static String solve(String A) {
        StringBuilder ans = new StringBuilder();
        Queue<Character> queue     = new LinkedList<>();
        Map<Character,Integer> map = new HashMap<>();
        char[] arr                 = A.toCharArray();

        for(int i = 0; i < arr.length; i++){
            char curr = arr[i];
            if(map.containsKey(curr)){
                map.put(curr, map.get(curr)+1);
            }else{
                map.put(curr, 1);
            }
           
            if(map.get(curr)==1){
                queue.add(curr);
            }

            while(!queue.isEmpty() && map.get(queue.peek()) > 1){
                queue.poll();
            }
            
            if(!queue.isEmpty()){
                ans.append(queue.peek());
            }else{
                ans.append("#");
            }
        }
    
        return ans.toString();
    }
}
