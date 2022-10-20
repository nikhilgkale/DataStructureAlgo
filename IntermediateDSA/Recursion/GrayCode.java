package Recursion;

import java.util.*;

public class GrayCode {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> numbers = grayCode(3);

        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");  
    }

    public static ArrayList<Integer> grayCode(int a) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);

        for(int i =0; i < a; i++){
            int size = list.size();

            for(int j = size-1; j >= 0; j--){
                list.add(list.get(j) + (1<<i));
            }
        }
        
        return list;
	}
}
