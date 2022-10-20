package Strings;

import java.util.*;

public class ChangeCharacter {

    public static void main(String[] args) {
        System.out.println("Hello World");


        int result = solve("abcabbcdbbe", 3);
        
        System.out.println(result);
    }

    public static int solve(String A, int B) {
        int result =0;

        char array[] = A.toCharArray();

        Arrays.sort(array);

        int tempCount = 1;
        char lastChar = array[0];
        List<Integer> letters = new ArrayList<Integer>();
        
        for(int i =1; i < array.length; i++){

            if(lastChar == array[i]){
                tempCount++;
            }else{
                //System.out.println(tempCount);
                letters.add(tempCount);
                tempCount = 1;
                lastChar  = array[i];
            }
        }
        //System.out.println(tempCount);
        letters.add(tempCount);

        Collections.sort(letters); 
        
        for(int i =0; i < letters.size(); i++){

            int occurance = letters.get(i);

            if(B >= occurance){
                B = B - occurance;
            }else{
                result++;
            }
        }

        return result;
    }
    
}
