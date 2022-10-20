package AdvancedDSA.Tress.BinaryTreeFromInorderAndPostorder;

import java.util.*;
import AdvancedDSA.Tress.TreeNode;

public class BinaryTreeFromInorderAndPostorder {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(); A.add(6); A.add(1); A.add(3);A.add(2);
        ArrayList<Integer> B = new ArrayList<>(); B.add(6); B.add(3); B.add(2); B.add(1);

        TreeNode root = buildTree(A, B);
        inorderTraversal(root);

        for(int j = 0; j < list.size(); j++){
            System.out.print(list.get(j) + " ");  
        }
    }

    //A-inorder B-postorder
    public static TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        return construct(A, B, 0,  A.size()-1,  0,  B.size()-1);
    }

    public static TreeNode construct(ArrayList<Integer> A, ArrayList<Integer> B, 
    int in_start, int in_end, int pos_start, int pos_end) {

        //base condition
        if(in_start > in_end){
            return null;
        }

        if(pos_start > pos_end){
            return null;
        }

        if(pos_end < 0){
            return null;
        }

        int idx = 0;
        int root_val  = B.get(pos_end);
        TreeNode root = new TreeNode(root_val);
        //System.out.println(" root_val : " +root_val); 

        for(int i = in_start; i <= in_end; i++){
            if(A.get(i) == root_val){
                idx = i;
                break;
            }
        }
        //System.out.println(" idx : " +idx); 
        int length = idx - in_start;

        root.left = construct(A, B, in_start,  idx-1,  pos_start,  pos_start+length-1);

        root.right = construct(A, B, idx+1, in_end, pos_start+length, pos_end-1);

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
