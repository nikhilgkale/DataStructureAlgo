package AdvancedDSA.Tress.PreorderTraversal.Recusrsion;

import java.util.ArrayList;

import AdvancedDSA.Tress.TreeNode;

public class PreOrderTraversalR {
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

        ArrayList<Integer> output = preorderTraversal(tn1);
        for(int i = 0; i < output.size(); i++){
            System.out.print(output.get(i) + " ");   
            System.out.println(); 
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> preorderTraversal(TreeNode A) {
        if(A == null) {
            return list;
        }
        list.add(A.val);
        preorderTraversal(A.left);
        preorderTraversal(A.right);

        return list;
    }
}
