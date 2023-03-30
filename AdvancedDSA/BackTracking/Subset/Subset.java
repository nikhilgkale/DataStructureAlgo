package AdvancedDSA.BackTracking.Subset;

import java.util.*;

public class Subset {
    
    public static void main(String[] args)
    {
    
        List<Integer> input = new ArrayList<Integer>();
        input.add(4); input.add(7); input.add(8);

        ArrayList<ArrayList<Integer>> output = subsets(input);
        if(output != null){
         
            for(int i = 0; i < output.size(); i++){
                ArrayList<Integer> subset = output.get(i);
                for(int j = 0; j < subset.size(); j++){
                    System.out.print(subset.get(j) + " " ); 
                }
                System.out.println();
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(List<Integer> input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int index = 0;
        Collections.sort(input);
        result.add(new ArrayList<>());
        generateSubsets(input, index, result, new ArrayList<>());
        return result;
    }

    private static void generateSubsets(List<Integer> input,
                                        int index,
                                        ArrayList<ArrayList<Integer>> result,
                                        ArrayList<Integer> subsets) {
        if (index < 0 || index >= input.size()) {
            return;
        }
        else {
            //case 1 - choosing the current value
            //Do Step
            subsets.add(input.get(index));
            result.add(new ArrayList<>(subsets));
            //Recur Step
            generateSubsets(input, index + 1, result, subsets);
            //Undo Step
            subsets.remove(subsets.size() - 1);
        
            //case 2 - Not Choosing current value
            generateSubsets(input, index + 1, result, subsets);
        }
    }
}
