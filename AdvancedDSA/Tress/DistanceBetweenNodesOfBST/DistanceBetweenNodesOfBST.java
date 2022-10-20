package AdvancedDSA.Tress.DistanceBetweenNodesOfBST;

import AdvancedDSA.Tress.TreeNode;

public class DistanceBetweenNodesOfBST {

    public static void main(String[] args)
    {
        TreeNode tn1 = new TreeNode(19);
        TreeNode tn2 = new TreeNode(7);
        TreeNode tn3 = new TreeNode(26);
        TreeNode tn4 = new TreeNode(4);
        TreeNode tn5 = new TreeNode(15);
        TreeNode tn6 = new TreeNode(24);
        TreeNode tn7 = new TreeNode(36);
        TreeNode tn8 = new TreeNode(2);

        tn1.left  = tn2;
        tn1.right = tn3;

        tn2.left  = tn4;
        tn2.right = tn5;

        tn3.left  = tn6;
        tn3.right = tn7;

        tn4.left = tn8;

        System.out.println(solve(tn1, 15, 2));  
    }

    public static int solve(TreeNode A, int B, int C) {
        int min=Math.min(B,C);
        int max=Math.max(B,C);
        TreeNode cur=A;
        while(cur.val<min||cur.val>max){
            if(cur.val<min){
                cur=cur.right;
            }
            if(cur.val>max){
                cur=cur.left;
            }
        }
           
          int  l = distance(cur,min);
          int  r = distance(cur,max);

          return l+r;
       
    }

    public static int distance(TreeNode a,int toFind){
        int retVal=0;
       
        if(a.val==toFind)return 0;
       
        if(toFind>a.val){
            retVal=distance(a.right,toFind);
        }
        else{
            retVal=distance(a.left,toFind);
        }
        return retVal+1;
    }
}
