package AdvancedDSA.Arrays;

import java.util.*;

public class AddOneToNumber {
    

    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<Integer> ip = new ArrayList<Integer>();
        //ip.add(9);ip.add(9);ip.add(9);ip.add(9);ip.add(9);
        //ip.add(0);ip.add(3);ip.add(7);ip.add(6);ip.add(4);ip.add(0);ip.add(5);ip.add(5);ip.add(5);//0, 3, 7, 6, 4, 0, 5, 5, 5
        ip.add(0);ip.add(3);ip.add(0);ip.add(6);ip.add(4);ip.add(0);//3, 0, 6, 4, 0
    
    
        ArrayList<Integer> output = plusOne(ip);

        System.out.println();
        for(int i = 0; i < output.size(); i++){
           System.out.print(output.get(i));
        }
        System.out.println();
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        System.out.println(n);
        Collections.reverse(A);
        
        ArrayList<Integer> output = new ArrayList<Integer>();
        //System.out.println("After Digit : " + digit);
        //System.out.println("After Unit : " + unit);
        int carry = 1;

        for(int i = 0; i < n; i++){

            carry = carry + A.get(i);
    
            if(carry > 9){
                output.add(carry%10);
                carry = carry/10;
                System.out.println("After Carry : " + carry);
                //System.out.println("After Unit : " + unit);
            }else{
                output.add(carry%10);
                carry = 0;
            }
        }
        if(carry>0){
            output.add(carry);
        }
 
        if(output.size() == n){
            int k = n-1;
            while(k>0){
                if(output.get(k)==0){
                    output.remove(k);
                    k=k-1;
                }else{
                    break;
                }
            }
        }
        Collections.reverse(output);

        return output;
    }
}
