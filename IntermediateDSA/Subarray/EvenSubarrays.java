package Subarray;

public class EvenSubarrays {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(new int[]{ 978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940 }));
            
    }

    public static String solve(int[] A) {
        
        int n = A.length;
    
        if(n%2 == 1 || A[0]%2 != 0 || A[n-1]%2 != 0){
            return "NO";
        }

        int i  = 1;
        int count  = 0;
        
        while(i < n){
            
            if(A[i]%2 == 0){
                
                if((i+1)%2 == 0){
                    if(i+1 < n && A[i+1]%2 == 0){
                        count = count+2;
                        break;
                    }
                }
            }
            i++;
        }

        System.out.println("Count : " + count);
        if(count%2==0){
            return "YES";
        }else{
            return "NO";
        }
    }
}
