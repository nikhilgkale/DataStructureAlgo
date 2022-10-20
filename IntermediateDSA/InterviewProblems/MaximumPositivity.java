package InterviewProblems;

import java.util.*;

public class MaximumPositivity {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> input = new ArrayList<Integer>();
        //-5173778, -8176176, 1694510, 7089884, -1394259, 1146372, -2502339, 1544618, 6602022, 4330572 
        //7251357, -6249230, 3917080, -5577664, -3417609, 2534660, -4723211, -3827311, -3854309, -6641510 
        input.add(5173778);
        input.add(-8176176);
        input.add(1694510);
        input.add(-7089884);
        input.add(-1394259);
        input.add(-1146372);
        input.add(-2502339);
        input.add(-1544618);
        input.add(-6602022);
        input.add(-4330572);

        ArrayList<Integer> output =
        solve(input);
        System.out.println();
        for(int i = 0; i < output.size(); i++){
            System.out.print(output.get(i)+ " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> output = new ArrayList<Integer>();

        int i =0;
        int j =0;
        int start = -1;
        int end   = -1;
        int n = A.size();

        while(i<n && j<n){

            if(A.get(j)>=0){
                j++;
            }
            else{
                if(end == -1 && start == -1){
                    if(j-i > end-start){
                        start = i;
                        end = j-1;
                        System.out.println("#1 Start : " + start + " " + " End : " + end);
                    }
                }
                else if(j-i > end-start+1){
                    start = i;
                    end = j-1;

                    System.out.println("#2 Start : " + start + " " + " End : " + end);
                }
                i=j+1;
                j++;
            }
        }
        if(j-i > end-start+1){
            start = i;
            end = j-1;

            System.out.println("#3 Start : " + start + " " + " End : " + end);
        }

        for(int k = start; k <= end; k++){
            output.add(A.get(k));
        }

        return output;
    }
}
