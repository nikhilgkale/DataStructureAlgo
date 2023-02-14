package Basics.SquareRootOfNumber;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(" >> Square Root of "+ n + " is : " + solve(n));
        System.out.println(" >> Square Root of "+ n + " is : " + solveOptimize(n));
    }
 
     public static int solve(int A) {
 
        int res   = -1;
        int count = 0;

        for(int i=1; i <= A/i; i++){
            count++;

            if(i*i==A){
                res = i;
                break;
            }
        }
        System.out.print(" Took # of iterations : "+ count);

        return res;
     }

     //Binary Search
     public static int solveOptimize(int A) {
 
        int res  = -1;
        int start = 0, end = A;
        int mid;
        int count = 0;
     
        // for computing integral part
        // of square root of number
        while (start <= end) {
            count++;
            mid = (start + end) / 2;
            if (mid * mid == A) {
                res = mid;
                break;
            }
     
            // incrementing start if integral
            // part lies on right side of the mid
            if (mid * mid < A) {
                start = mid + 1;
                //ans = mid;
            }
     
            // decrementing end if integral part
            // lies on the left side of the mid
            else {
                end = mid - 1;
            }
        }
        System.out.print(" Took # of iterations : "+ count);


        return res;
     }
}
