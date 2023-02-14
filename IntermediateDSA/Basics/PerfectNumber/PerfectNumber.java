package Basics.PerfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
         System.out.println("Is " + n + " Perfect Number : " + solve(n));
     }
 
     public static String solve(int A) {
        String result = "NO";
 
         int sum = 1;
         for(int i = 2; i <= A/2; i++){
             if(A%i == 0){
                 sum+= i;
             }
         }
 
         if(sum == A){
             result = "YES";
         }
         return result;
     }
}
