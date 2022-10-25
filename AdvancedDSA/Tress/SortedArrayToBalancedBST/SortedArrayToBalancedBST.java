package AdvancedDSA.Tress.SortedArrayToBalancedBST;

import java.util.ArrayList;

import AdvancedDSA.Tress.TreeNode;

public class SortedArrayToBalancedBST {

    public static void main(String[] args)
    {
        TreeNode root = sortedArrayToBST(new int[]{1,2,3,5,10});
        inorderTraversal(root);

        for(int j = 0; j < list.size(); j++){
            System.out.print(list.get(j) + " ");  
        }
    }
    //Just for printing
    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> inorderTraversal(TreeNode A) {
        if(A == null) {
            return list;
        }
        inorderTraversal(A.left);
        list.add(A.val);
        inorderTraversal(A.right);

        return list;
    }

    public static TreeNode sortedArrayToBST(final int[] A) { 
        return buildBST(A, 0, A.length-1);
    }

    public static TreeNode buildBST(int[] A, int l, int r){

        if(l>r){
            return null;
        }

        int mid       = (l+r)/2;
        TreeNode root = new TreeNode(A[mid]);

        root.left  = buildBST(A, l, mid-1);
        root.right = buildBST(A, mid+1, r);

        return root;
    }
}
