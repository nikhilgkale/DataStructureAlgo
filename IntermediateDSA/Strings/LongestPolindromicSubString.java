package Strings;

public class LongestPolindromicSubString {
    
    public static void main(String[] args) {
        System.out.println("Hello World");


        String result = longestPalindrome("a");
        
        System.out.println(result);
    }

    public static String longestPalindrome(String A) {

        char[] array = A.toCharArray();

        String result = ""+ array[0];

        int maxLength = 1;

        for(int i =0; i < array.length; i++){

            String even = expand(array, i, i);

            if(maxLength < even.length()){
                
                result    = even;
                maxLength = even.length();
            }
            
            String odd = expand(array, i, i+1);
            if(maxLength < odd.length()){
                result    = odd;
                maxLength = odd.length();
            }
        }
        
        return result;
    }

    private static String expand(char[] arr, int i, int j){
        StringBuilder palindromicStr = new StringBuilder();

        //System.out.println(i + " : " + j);

        while(i>=0 && j < arr.length && arr[i] == arr[j]){
            if(i!=j){
                palindromicStr.insert(0,arr[i]);
            }
            palindromicStr.append(arr[j]);

            i--;
            j++;
        }

        //System.out.println(palindromicStr);

        return palindromicStr.toString();
    }
}
