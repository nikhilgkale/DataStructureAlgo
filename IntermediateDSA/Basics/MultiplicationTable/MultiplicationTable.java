package Basics.MultiplicationTable;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 6;

        if(n>0){
            for(int i=1; i <=10; i++){
                int output = n *i;
                System.out.println(n + " * " + i + " = " + output );
            }
        }
     }
}
