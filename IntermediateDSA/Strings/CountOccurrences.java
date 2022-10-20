package Strings;

public class CountOccurrences {
    
    public static void main(String[] args) {
        System.out.println("Hello World");


        int result = solve("bobabtbobl");
        
        System.out.println(result);
    }

    public static int solve(String A) {

        int result    = 0;
        int N         = A.length();
        int totalComb = 0;

        while(totalComb < (N-2)){

            if(A.substring(totalComb, totalComb+3).equals("bob")){
                result++;
            }

            totalComb++;
        }


       return result;
    }
}
