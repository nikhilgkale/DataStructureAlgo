package Recursion;

public class KthSymbol {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        System.out.println(solve(2,1));  
    }

    public static int solve(int A, int B) {

        return Integer.parseInt(getString(A).substring(B-1,B));
    }

    public static String getString(int A) {
        
        if(A == 1){
            return "0";
        }

        String org = getString(A-1);

        //char[] arr = org.toCharArray();

        StringBuilder output = new StringBuilder();

        for(int i =0; i < org.length(); i++){

            if(org.charAt(i) == '0'){
                output.append("01");
            }else{
                output.append("10");
            }
        }
        
        return output.toString();
    }
}
