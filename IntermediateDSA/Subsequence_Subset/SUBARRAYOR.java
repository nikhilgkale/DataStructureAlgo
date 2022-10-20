package Subsequence_Subset;

public class SUBARRAYOR {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(solve(new int[]{1,2,3,4,5}));
    }
    
    public static int solve(int[] A) {
        long n=A.length;
		long tot_subArray=(n*(n+1))/2;
		long ans=0;
		for(int i=0;i<32;i++) {
			long subArray=0;
			long bitzero=0;
			for(int j=0;j<n;j++) {
				if((A[j]&(1<<i))==0) {
					bitzero+=1;
				}
				if((A[j]&(1<<i))>0|| j==n-1) {
					subArray+=(bitzero*(bitzero+1))/2;
					bitzero=0;
				}
                if(i < 3)
                 System.out.println("i j bit sub: " + i + "," + j + "," + bitzero+  "," + subArray);
			}
			ans+=(tot_subArray-subArray)*(long)Math.pow(2, i);
			ans=ans%1000000007;
            if(i < 3)
                 System.out.println(" Ans : " +ans);
            
		}
        return (int)ans;
    }
}
