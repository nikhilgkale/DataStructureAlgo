package Basics.ArmstrongNumbers;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int n = 200;
        System.out.println("Armstrong Numbers between 1 to " + n + " : ");
        solve(n);
     }
 
     public static void solve(int N) {
        if(N>0){
            for(int i = 1; i <= N; i++){
                armstrong(i);
            }
        }
     }

     public static void armstrong(int num){
        int sum        = 0;
        int orginalNum = num;

        while (num !=0){
            int digit = num % 10;

            if(digit > 0){
                sum = sum + (digit*digit*digit);
            }

            num = num-digit;

            if(num>0){
                num = num /10;
            }
        }
        if(sum == orginalNum){
            System.out.print(orginalNum + " ");
        }
     }  
}
