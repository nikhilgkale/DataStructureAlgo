package AdvancedDSA.Tress.RightViewOfBinaryTree;

import java.util.*;

import AdvancedDSA.Tress.TreeNode;

public class RightViewOfBinaryTree {
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

        ArrayList<Integer> left = solve(tn1);

        for(int j = 0; j < left.size(); j++){
            System.out.print(left.get(j) + " ");  
        }
    }
    
    public static ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> left = new ArrayList<>();

        ArrayList<ArrayList<Integer>> output = levelOrder(A);
        for(int i = 0; i < output.size(); i++){
            left.add(output.get(i).get(0));
        }
        return left;
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

            if(tn.right != null){
                queue.add(tn.right);
            }
            if(tn.left != null){
                queue.add(tn.left);
            }
        }
        output.add(level);
        return output;
    }
}
