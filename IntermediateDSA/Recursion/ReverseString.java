package Recursion;

public class ReverseString {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        reverseString(new StringBuilder("scaleracademy"));
    }

    private static void reverseString(StringBuilder sb){

        if(sb != null && sb.length() != 0){
            System.out.print(sb.substring(sb.length()-1));
            sb.deleteCharAt(sb.length() - 1);
            reverseString(sb);
        }
    }
}
