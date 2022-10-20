package Subsequence_Subset;

public class SubsequenceSumProblem {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        //System.out.println(solve(new int[]{87538, 59509, 15940, 30570, 17686, 55831, 74461, 
        //    92198, 4872, 41884, 22828, 82415, 82829, 78818, 66225, 64102, 92580, 24777, 41751, 92808}, 1036814));
        System.out.println(solve(new int[]{1,2,13,5,4},18));
    }
    public static int solve(int[] A, int B) {

        int n = A.length;
        
        int power = (int)java.lang.Math.pow(2,n);

        for(int i=0; i < power; i++){
            int x = 0;
            int sum = 0;
            int num = i;

            while(num >0){
            if((num & 1) == 1 ){
                System.out.print(x);
                sum += A[x];
            }
            x++;
            num = num>>1;
            }
            System.out.print("|");
            if(sum==B){
                return 1;
            }
        }

        return 0;
    }
}
