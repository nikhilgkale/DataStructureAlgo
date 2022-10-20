package AdvancedDSA.Tress.BinaryTreeFromInorderAndPreorder;

import java.util.*;

import AdvancedDSA.Tress.TreeNode;

public class BinaryTreeFromInorderAndPreorder {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(); A.add(1); A.add(2); A.add(3);
        ArrayList<Integer> B = new ArrayList<>(); B.add(2); B.add(1); B.add(3);

        TreeNode root = buildTree(A, B);
        inorderTraversal(root);

        for(int j = 0; j < list.size(); j++){
            System.out.print(list.get(j) + " ");  
        }
    }

    //A- preorder B- inorder
    public static TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        return construct(A, B, 0,  B.size()-1,  0,  A.size()-1);
    }

    public static TreeNode construct(ArrayList<Integer> A, ArrayList<Integer> B, 
    int in_start, int in_end, int pre_start, int pre_end) {

        //base condition
        if(in_start > in_end){
            return null;
        }

        if(pre_start > pre_end){
            return null;
        }
        int idx = 0;
        int root_val  = A.get(pre_start);
        TreeNode root = new TreeNode(root_val);

        for(int i = in_start; i <= in_end; i++){
            if(B.get(i) == root_val){
                idx = i;
                break;
            }
        }

        int length = idx - in_start;

        root.left = construct(A, B, in_start,  idx-1,  pre_start+1,  pre_start+length);

        root.right = construct(A, B, idx+1, in_end, pre_start+length+1, pre_end);

        return root;
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
}
