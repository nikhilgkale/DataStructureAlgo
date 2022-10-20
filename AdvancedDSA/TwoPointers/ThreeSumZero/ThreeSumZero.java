package AdvancedDSA.TwoPointers.ThreeSumZero;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSumZero {
    public static void main(String[] args)
    {
        ArrayList<Integer> input = new ArrayList<Integer>();//-1,0,1,2,-1,4
        input.add(-1);
        input.add(0);
        input.add(1);
        input.add(2);
        input.add(-1);
        input.add(4);

        ArrayList<ArrayList<Integer>> output = threeSum(input);

        for(int i=0; i<output.size(); i++){
            ArrayList<Integer> list = output.get(i);
            for(int k=0; k<3; k++){
                System.out.print(list.get(k)+ " ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
	// For a
	for(int i=0;i<n-3;i++){
            // Take 2 pointers here to check the total sum
            // for b and c
	    int p1 = i+1, p2 = n-1;
            while(p1<p2){
                int sum = A.get(i) + A.get(p1) + A.get(p2);
                if(sum==0){
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(A.get(i));
                    tmp.add(A.get(p1));
                    tmp.add(A.get(p2));
                    Collections.sort(tmp);
                    if(!ar.contains(tmp)){
                        ar.add(tmp);
                    }
                    p1++;
                }
                else if(sum<0){
                    p1++;
                }
                else{
                    p2--;
                }
            }
        }
        return ar;
    }
}
