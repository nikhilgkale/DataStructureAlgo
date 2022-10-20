package AdvancedDSA.Hashing.CommonElements;

import java.util.*;

public class CommonElements {

    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        A.add(1); A.add(2);A.add(2);A.add(1);
        B.add(2);B.add(3);B.add(1);B.add(2);

        //2, 1, 4, 10
        //3, 6, 2, 10, 10
        ArrayList<Integer> output = solve(A, B);
        
        System.out.println();  
        for(int i = 0; i < output.size(); i++)
            System.out.print(output.get(i)+ ",");  
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer,Integer> hmA = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hmB = new HashMap<Integer,Integer>();

        for(int i =0; i < A.size(); i++){
            if(hmA.containsKey(A.get(i))){
                hmA.put(A.get(i),hmA.get(A.get(i))+1);
            }else{
                hmA.put(A.get(i),1);
            }
        }

        for(int i =0; i < B.size(); i++){
            if(hmB.containsKey(B.get(i))){
                hmB.put(B.get(i),hmB.get(B.get(i))+1);
            }else{
                hmB.put(B.get(i),1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
       
        for (Map.Entry<Integer, Integer>
                entry : hmA.entrySet()){
            int a = entry.getKey();
            if(hmB.containsKey(a)){
               
                int aCount = entry.getValue();
                int bCount = hmB.get(a);

                if(aCount == bCount){
                    while(aCount !=0){
                        list.add(a);
                        aCount--;
                    }
                }else if(aCount < bCount){
                    while(aCount !=0){
                        list.add(a);
                        aCount--;
                    }
                }else{
                    while(bCount !=0){
                        list.add(a);
                        bCount--;
                    }
                }
            }
        }
        return list;
    }
}
