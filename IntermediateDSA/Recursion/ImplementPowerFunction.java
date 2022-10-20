package Recursion;

public class ImplementPowerFunction {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(pow(71045970,41535484, 64735492));
        
        System.out.println(pow(2,3, 3));
    }
        //20805472
        //41528220
    
    private static long pow(int A, int B, int C) {
        
        if(B==0){
            return 1;
        }
    
        //return ((A % C) * (pow(A,B-1, C)%C))%C;
        //return (A%C * pow(A,B-1,C)%C)%C;

        
        long half = pow(A,B/2, C);

        if(B%2 == 0){
            return (half%C* half%C)%C;
        }else{
            return (A%C * half%C * half%C)%C;
        }
        

        /* 
        long pow = 1;
        while(B !=0){
            pow = (pow %C * A %C)%C;
            B--;
        }
        return pow%C;
        */
    }
    
    
     /* 
     public static int pow(int A, int B, int C) {

        if(A==0){
            return 0;
        }

        if(B==0){
            return 1%C;
        }
        //20805472
        //41528220
        int half = pow(A,B/2, C)%C;

        if(B%2 == 0){
            int result = ((half%C) * (half%C))%C;
            if(result < 0){
                return result + C;
            }else{
                return result;
            } 
        }else{
            int result =  ((A%C) * (half%C) * (half%C))%C; 
            if(result < 0){
                return result + C;
            }else{
                return result;
            }
        }
    }*/
    
}
