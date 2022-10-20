package AdvancedDSA.BinarySearch.AthMagicalNumber;

public class AthMagicalNumber {
    public int solve(int A, int B, int C) {
        //Ath element can not go beyong Ath multiple of Minimum of B,C.
        long high = ((long) A)*Math.min(B,C);
        //low would be the first multiple of Minimum of B,C.
        long low = Math.min(B,C);
        int mod = 1000000007;

        //Once the search space is defined.
        if(A == 1)
            return (int) low;
       
        //To calculate the Ath position divisble by B or C, we need to (imagine) think of the A multiples of B and C atleast(say 5)
        // But we don't need to calculate the common multiple twice.
        //So we need to calculate lcm of B & C, to be able to reduce the common multiple of B and C.
        long lcm = (((long) B)*C)/gcd(B,C);
        long ans = low;
       
        //Now we are ready to run Binary Search for the search space defined above.
        while(low <= high){
            long mid = low + (high - low)/2;
            long countB = mid/B;
            long countC = mid/C;
            //To Reduce count of common factors.
            long commonFactors = mid/lcm;
            long position = (countB + countC - commonFactors);
            //As we need the Ath Smallest,
            if(position >= A){
               ans = mid ;
               high = mid - 1;;
            }else
                low = mid + 1;
        }
        if(ans < 0 ){
            ans += mod;
        }
        return (int) (ans%mod);
    }
   
    static int gcd(int x, int y){
        if(x==0){
            return y;
        }

        return gcd(y%x,x);
    }
}
