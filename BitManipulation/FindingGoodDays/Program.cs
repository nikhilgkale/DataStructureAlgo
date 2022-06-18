namespace FindingGoodDays
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(solve(7));
        }

        public static int solve(int A) {

            if(A != 0){

                int count = 0;

                while(A > 0){
                    A = A & (A-1);
                    count++;
                }

                return count;
            }
            return 0;
        }
    }
}