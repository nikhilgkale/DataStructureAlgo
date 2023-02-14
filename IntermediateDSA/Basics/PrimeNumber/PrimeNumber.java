package Basics.PrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
       int n = 13;
        System.out.println("Is "+ n + " Prime : " + solve(n));
    }

    public static String solve(int A) {
        String result = "YES";

        int count = 0;
        for(int i = 2; i < A; i++){
            if(A%i == 0){
                count++;
            }
        }

        if(count>0){
            result = "NO";
        }
        return result;
    }
}
