package AdvancedDSA.BitManipulation;

public class StrangeEquality {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
    
        System.out.println(solve(4));
    }

    public static int solve(int A) {
    
        int x = 0;
        int y = 0;
        int count = 0;

        for(int i = 0; i < 32 && count < 2; i++){
            if((A&(1<<i))==0){
                System.out.println("i: "+i);
                int temp = (1<<i);
                System.out.println("temp: " +temp);
                if((temp < A) && ((temp+A) == (temp ^ A)) && count == 0){
                    x = temp;
                    System.out.println("x: " + x);
                    count++;
                }
                else if((temp > A) && ((temp+A) == (temp ^ A))){
                    y = temp;
                    System.out.println("y: " + y);
                    count++;
                    break;
                }
                
            }
        }

        return x^y;
    }
}
