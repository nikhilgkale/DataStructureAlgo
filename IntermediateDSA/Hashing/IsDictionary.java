package Hashing;

import java.util.*;

public class IsDictionary {
    public static void main(String[] args) {
        System.out.println("Hello World");


        int result = solve(new String[]{"hello", "scaler", "interviewbit" },"adhbcfegskjlponmirqtxwuvzy");
        //int result = solve(new String[]{"fine", "none", "no" },"qwertyuiopasdfghjklzxcvbnm");
        //int result = solve(new String[]{"ipial", "qjqgt", "vfnue", "vjqfp", "eghva", "ufaeo", "atyqz", "chmxy", "ccvgv", "ghtow" },"nbpfhmirzqxsjwdoveuacykltg");

        System.out.println(result);
    }


    public static int solve(String[] A, String B) {

        int result = 1;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] array                          = B.toCharArray();

        for(int i=0; i < B.length(); i++){
            map.put(array[i], i+1);
        }

        System.out.println(map.size());

        for(int i=1; i < A.length; i++){

            char[] previous = A[i-1].toCharArray();
            char[] current  = A[i].toCharArray();

            int N     = java.lang.Math.min(previous.length, current.length);
            int count = 0;
            
            for(int j=0; j < N; j++){

                if(map.get(previous[j]) < map.get(current[j])){
                    break;
                }
                else if(map.get(previous[j]) > map.get(current[j])){
                    System.out.println( A[i-1] + " " + A[i]);
                    System.out.println(previous[j] + " " +current[j]);
                    return 0;
                }else{
                    count++;
                }

                if(count == N && current.length == N && previous.length > N){
                    //System.out.println("Line 52");
                    return 0;
                }
            }
        }

        return result;
    }
}
