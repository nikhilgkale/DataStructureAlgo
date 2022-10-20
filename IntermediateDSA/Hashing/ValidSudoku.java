package Hashing;
import java.util.*;

public class ValidSudoku {
    
    public static void main(String[] args) {
        System.out.println("Hello World");

        int output = isValidSudoku(new String[]{"....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......"});

        //"..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.."
       
        System.out.println(output);
    }
     public static int isValidSudoku(final String[] A) {

        HashSet<Integer> set = new HashSet<Integer>();

        int N = A.length;
        int[][] array = new int[N][N];


        for(int i =0; i < N; i++){
            /*
            char[] row = A[i].toCharArray();

            for(int j =0; j < N; j++){

                 if(row[j] != ' '){

                     if(!set.contains(Character.getNumericValue(row[j])){
                        set.add(Character.getNumericValue(row[j]);
                     }else{
                         return 0;
                     }
                 }
             }
            */
            int[] row = A[i].chars().map(x -> (x=='.')?0:x-'0').toArray();

            for(int j =0; j < N; j++){
                
                array[i][j] = row[j];

                if(row[j] != 0){
                    if(!set.contains(row[j])){
                        set.add(row[j]);
                    }else{
                        System.out.println("47 :" +row[j]);
                        return 0;
                    }
                }
            }
            set.clear();
        }

        for(int i =0; i < N; i++){
            for(int j =0; j < N; j++){
                
                if(array[j][i] != 0){
                    if(!set.contains(array[j][i])){
                        set.add(array[j][i]);
                    }else{
                        System.out.println("60 :" +array[j][i]);
                        return 0;
                    }
                }
            }
            set.clear();
        }

        int r = 0;
        int c = 0;

        int rThreshold = N/3;
        int cThreshold = N/3;
        
        while((rThreshold < (N+1)) && (cThreshold < (N+1))){
            for(int i =r; i < rThreshold; i++){
                //System.out.println("81 :" + i);
                for(int j =c; j < cThreshold; j++){
                    //System.out.println("83 :" + j);
                    if(array[i][j] != 0){
                        if(!set.contains(array[i][j])){
                            set.add(array[i][j]);
                        }else{
                            //System.out.println("80 :" + i +" " + j + " "+array[i][j]);
                            return 0;
                        }
                    }
                }
            }
            //System.out.println("Size : " + set.size());
 
            set.clear();

            //r = r+(N/3);
            c = c+(N/3);

            //rThreshold = rThreshold + N/3;
            cThreshold = cThreshold + N/3;

            if(c > N){

                if(r<N){
                    r          = r+(N/3);
                    rThreshold = rThreshold + N/3;
                    c          = 0;
                    cThreshold =  N/3;
                }
            }
        }

        return 1;
    }
}
