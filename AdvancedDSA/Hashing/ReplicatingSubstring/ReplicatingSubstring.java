package AdvancedDSA.Hashing.ReplicatingSubstring;

import java.util.*;

public class ReplicatingSubstring {

    public static void main(String[] args)
    {
        System.out.println(solve(2, "bbaabbb"));  
    }

    public static int solve(int A, String B) {
        int n = B.length();

        char[] ch = B.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i], hm.get(ch[i])+1);
            }else{
                hm.put(ch[i], 1);
            }
        }

        
        for (Map.Entry<Character, Integer>
                 entry : hm.entrySet()){
            if(entry.getValue()%A != 0){
                return -1;
           }
        }

        return 1;
    }
}
