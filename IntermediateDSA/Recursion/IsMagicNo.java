package Recursion;

public class IsMagicNo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(83557));
        System.out.println(solve(1291));
    }

    public static int solve(int A) {

        return (sod(A) == 1) ? 1 : 0;
    }

    public static int sod(int A) {

        if(A==0){
            return 0;
        }

        if(A<10){
            return A;
        }

        return sod(sod(A/10) + A%10);
    }
}
