package Basics.SummationGame;

public class SummationGame {
    public static void main(String[] args) {
        int n = 10;
         System.out.println("Sum of "+ n + " natural number is : " + solve(n));

         System.out.println("Sum of "+ n + " whole number is : " + solveWholeNumber(n));
     }
 
     public static int solve(int A) {
 
         return A*(A+1) /2;
     }

     public static int solveWholeNumber(int A) {
 
        return A*(A-1) /2;
    }
}
