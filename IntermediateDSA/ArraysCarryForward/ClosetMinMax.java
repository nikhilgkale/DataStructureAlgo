package ArraysCarryForward;

public class ClosetMinMax {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(new int[]{ 814, 761, 697, 483, 981  }));
    }

    public static int solve(int[] A) {

        int ans = A.length;
        int min_val = A[0];
        int max_val = A[0];

        int min_i = -1;
        int max_i = -1;


        for(int i =1; i < A.length; i++){
            if(min_val > A[i]){
                min_val = A[i];
            }

            if(max_val < A[i]){
                max_val = A[i];
            }
        }

        System.out.println("Min : " + min_val);
        System.out.println("Max : " + max_val);

        if(min_val == max_val){
            return 1;
        }

        for(int i = A.length-1; i >=0; i--){

            if(A[i] == min_val){
                min_i = i;
                if(max_i != -1){
                    ans = Math.min(ans, max_i - min_i+1);
                }
            }else if(A[i] == max_val){ 
                max_i = i;
                if(min_i != -1){
                    ans = Math.min(ans, min_i - max_i+1);
                }
            }
        }
        return ans;
    }
}
