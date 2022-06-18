namespace SubarraysWithBitwiseOR1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(solve(15,new int[]{0,1,0,0,1,0,0,0,1,1,0,0,1,1,0}));
        }

         public static long solve(int A, int[] B) {

            long ans = 0;
            long count =0;
          
            for(int i = 0; i < A; i++){
                if(B[i] == 1){
                    count = i+1;
                }
                ans = ans + count;
            }
            return ans;
         }    
    }
}
