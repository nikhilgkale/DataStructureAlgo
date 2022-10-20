package AdvancedDSA.Arrays;
import java.util.*;

public class MaxNonNegativeSubarray {

    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<Long> ip = new ArrayList<Long>();//1, 2, 5, -7, 2, 3
        //ip.add(1);ip.add(2);ip.add(5);ip.add(-7);ip.add(2);ip.add(3);ip.add(4);//ip.add(2);
        //ip.add(0);ip.add(0);ip.add(-1);ip.add(0);
        ip.add(1967513926L); ip.add(1540383426L); ip.add(-1303455736L); ip.add(-521595368L);

        ArrayList<Long> output = maxset(ip);

        System.out.println();
        for(int i = 0; i < output.size(); i++){
           System.out.print(output.get(i));
        }
        System.out.println();
    }
    public static ArrayList<Long> maxset(ArrayList<Long> A) {
        

        ArrayList<Long> output = new ArrayList<Long>();
        ArrayList<Long> temp = new ArrayList<Long>();
        
        long sum = 0;
        long maxValue = -1;

        for(int i=0; i<A.size();i++){
            if(A.get(i)<0){
                sum  = 0;
                temp.clear();
                temp = null;
                temp = new ArrayList<Long>();

            }else{
                sum=sum+A.get(i);
                temp.add(A.get(i));
                
                System.out.print(i);
                System.out.print(maxValue<=sum);
                System.out.print("Compare : " + maxValue + ","+ sum);
                if(maxValue<sum || (maxValue==sum && output.size() < temp.size())){
                    
                    maxValue=sum;
                    output = new ArrayList<Long>(temp);
                }
            }
        }
        temp.clear();
        return output;
    }
}
    
