package Subsequence_Subset;

import java.util.*;

public class SubsetScaler {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        int[][] finalOutput = subsets(new int[]{3, 12, 13, 20, 6, 4, 7, 14, 18});
        
        for(int i = 0; i < finalOutput.length; i++){
            for(int j = 0; j < finalOutput[i].length; j++){
                System.out.print(finalOutput[i][j] + " ");
            }
            System.out.println();
        } 
    }

    public static int[][] subsets(int[] A) {

        List<List<Integer>> result  = new ArrayList<>();
        ArrayList<Integer>  current = new ArrayList<Integer>();
        Arrays.sort(A);
        subsets(A, 0, current, result);

        Collections.sort(result, (o1, o2) -> {
            int n = Math.min(o1.size(), o2.size());
            for (int i = 0; i < n; i++) {
                if (o1.get(i) == o2.get(i)){
                    if(i==n){
                        return 1;
                    }
                    continue;
                }else {
                    return o1.get(i) - o2.get(i);
                }
            }
            return 1;
        });

        
        
        return result.stream()
        .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);

    }

    private static void subsets(int[] A, int i, ArrayList<Integer> cur, List<List<Integer>> res){
        if(i >= A.length){
            Collections.sort(cur);  
            res.add(cur);
            return;
        }

        subsets(A, i+1, new ArrayList<Integer>(cur), res);
        cur.add(A[i]);
        subsets(A, i+1, new ArrayList<Integer>(cur), res);
        return;
    }
}
