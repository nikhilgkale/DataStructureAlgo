package AdvancedDSA.Hashing.CheckPalindromeII;

import java.util.*;

public class CheckPalindromeII {
    public static void main(String[] args)
    {
        System.out.println(solve("abbcee"));  
    }

    public static int solve(String A) {
        int n = A.length();

        char[] ch = A.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i], hm.get(ch[i])+1);
            }else{
                hm.put(ch[i], 1);
            }
        }

        int count = 0;
        for (Map.Entry<Character, Integer>
                 entry : hm.entrySet()){
            if(entry.getValue()%2 != 0){
                count++;
           }
        }

        if(count>1){
            return 0;
        }

        return 1;
    }
}
