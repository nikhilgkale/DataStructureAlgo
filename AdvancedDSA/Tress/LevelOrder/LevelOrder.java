package AdvancedDSA.Tress.LevelOrder;

import java.util.*;

import AdvancedDSA.Tress.TreeNode;

public class LevelOrder {
    public static void main(String[] args)
    {
        TreeNode tn1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(9);
        TreeNode tn3 = new TreeNode(20);
        TreeNode tn4 = new TreeNode(15);
        TreeNode tn5 = new TreeNode(7);

        tn1.left  = tn2;
        tn1.right = tn3;

        tn3.left  = tn4;
        tn3.right = tn5;

        ArrayList<ArrayList<Integer>> output = levelOrder(tn1);
        for(int i = 0; i < output.size(); i++){
            ArrayList<Integer> level = output.get(i);

            for(int j = 0; j < level.size(); j++){
                System.out.print(level.get(j) + " ");  
            }
            System.out.println(); 
        }
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(A);
        queue.add(null);

        ArrayList<Integer> level = new ArrayList<>();
        
        while(queue.size() > 1){

            TreeNode tn = queue.peek();
            queue.poll();

            if(tn == null){
                queue.add(null);
                output.add(level);
                level = new ArrayList<Integer>();
                //System.out.println();
                continue;
            }

            //System.out.print(tn.val);
            level.add(tn.val);

            if(tn.left != null){
                queue.add(tn.left);
            }
            if(tn.right != null){
                queue.add(tn.right);
            }

        }
        output.add(level);
        return output;
    }
}
