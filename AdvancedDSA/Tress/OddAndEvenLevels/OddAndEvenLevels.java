package AdvancedDSA.Tress.OddAndEvenLevels;

import AdvancedDSA.Tress.TreeNode;

public class OddAndEvenLevels {
    public static void main(String[] args)
    {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn4 = new TreeNode(4);
        TreeNode tn5 = new TreeNode(5);
        TreeNode tn6 = new TreeNode(6);
        TreeNode tn7 = new TreeNode(7);
        TreeNode tn8 = new TreeNode(8);

        tn1.left  = tn2;
        tn1.right = tn3;

        tn2.left  = tn4;
        tn2.right = tn5;

        tn3.left  = tn6;
        tn3.right = tn7;

        tn4.left  = tn8;
        
        System.out.println(solve(tn1));
    }

    public static int solve(TreeNode A) {
        if(A==null) return 0;

        return A.val-solve(A.left)-solve(A.right);
    }
}
