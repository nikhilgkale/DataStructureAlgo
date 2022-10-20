package AdvancedDSA.Tress.SerializeBinaryTree;

import java.util.*;

import AdvancedDSA.Tress.TreeNode;

public class SerializeBinaryTree {
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

        ArrayList<Integer> output = solve(tn1);
        for(int i = 0; i < output.size(); i++){
            System.out.print(output.get(i) + ", ");   
        }
    }

    public static ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(A);
        queue.add(null);


        while(queue.size() > 1){

            TreeNode tn = queue.peek();
            queue.poll();

            if(tn == null){
                queue.add(null);
                //System.out.println();
                continue;
            }

            //System.out.print(tn.val);
            output.add(tn.val);

            if(tn.left != null){
                queue.add(tn.left);
            }
            else{
                //output.add(-1);
            }
            if(tn.right != null){
                queue.add(tn.right);
            }else{
                //output.add(-1);
            }

        }
        return output;
    }
}
