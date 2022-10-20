package Subarray;

import java.util.*;;
public class AlternatingSubarraysEasy {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> input = new ArrayList<Integer>();//0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1
        
        input.add(0);
        input.add(0);
        input.add(0);
        input.add(1);
        input.add(0);
        input.add(0);
        input.add(0);
        input.add(1);
        input.add(0);
        input.add(1);
        input.add(1);

        ArrayList<Integer> output =
        solve(input, 1);
        System.out.println();
        for(int i = 0; i < output.size(); i++){
            System.out.print(output.get(i));
        }
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        //int length = 2*B+1;
        for(int i=B; i < A.size() - B; i++){
           
            int j = i-B;
            int k = i+B;
            int count = 0;
            int ithBit = A.get(i);

            while(j<k){
                
                if(A.get(j) == A.get(k)){

                    System.out.print("i :" +i);//System.out.print("j :" +j);System.out.print("k :" +k);

                    if((i-j)%2 == 0 && A.get(j) == ithBit){
                        count++;
                    }
                    else if((i-j)%2 == 1 && A.get(j) != ithBit){
                        count++;
                    }
                }
                j++;
                k--;
            }
            if(count == B){
                output.add(i);
            }
        }

        return output;
    }
    
}
