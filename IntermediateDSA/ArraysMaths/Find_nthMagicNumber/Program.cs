namespace Find_nthMagicNumber
{
    class Program
    {
        static void Main(string[] args)
        {
             Console.WriteLine(solve(10));
        }

        public static int solve(int A) {
            int ans =0;
            int i = 0;

            while(A>0){
                int r = A%2;
                Console.WriteLine("r = " + r);
                ans = ans + (pow(5,i+1) * r);
                Console.WriteLine(ans);
                i++;
                A=A/2;
            }

            return ans;
        }

        public static int pow(int A, int B){
            int ans = 1;
            while(B > 0){
                ans = ans * A;
                B--;
            }

            //Console.WriteLine(ans);
            return ans;
        }
    }
}