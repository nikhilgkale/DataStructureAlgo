package AdvancedDSA.Hashing.ColorfulNumber;

import java.util.*;

public class ColorfulNumber {

    public static void main(String[] args)
    {
        System.out.println(colorful(624));  
    }

    
    public static int colorful(int A) {
        if(A==1 || A==0){
            return 1;
        }

        HashSet<Integer> set    = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();


        while(A!=0){
            int digit = A%10;
            A= A/10;

            if(digit == 0 || digit == 1 || set.contains(digit)){
                return 0;
            }else{
                list.add(digit);
                set.add(digit);
            }
        }
        
        for(int i=0; i<list.size(); i++){
            int pro=1;

            for(int j=i+1; j<list.size(); j++){

                pro=pro*(list.get(i)*list.get(j));
                if(set.contains(pro)){
                    return 0;
                }
                set.add(pro);
            }
        }
        return 1;
    }
}
