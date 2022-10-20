package Strings;

public class LongestCommonPrefix {
    
    public static void main(String[] args) {
        System.out.println("Hello World");


        String result = longestCommonPrefix(new String[]{"aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        //String result = longestCommonPrefix(new String[]{"abcd", "abde", "abcf"});
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] A) {

        if(A.length == 1){
            return A[0];
        }
        
        StringBuilder result = new StringBuilder();

        char[] previous = A[0].toCharArray();
        
        for(int i = 1; i < A.length; i++)
        {

            char[] current  = A[i].toCharArray();

            int N= java.lang.Math.min(previous.length, current.length);

            System.out.println(N);

            for(int j = 0; j < N; j++)
            {
                if(previous[j] == current[j]){
                    //if(i==1)
                    {
                        result.append(previous[j]);
                    }
                }else{
                    if(result.length()>0){

                        if(j==0){
                            result.setLength(0);
                        }else{
                            result.delete(j, result.length());
                        }
                    }
                    break;
                }
            }
            System.out.println(result.toString());
            previous = result.toString().toCharArray();
            if(i != A.length-1){
                result.setLength(0);
            }
        }
        

        return result.toString();
    }
}
