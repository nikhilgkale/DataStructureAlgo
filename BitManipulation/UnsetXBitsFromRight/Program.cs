namespace UnsetXBitsFromRight
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(solve(53,5));
        }

        public static long solve(long A, int B) {
            
            long result = A & ~(1);
            for(int i = 1; i < B; i++){
                result = result & ~(1<<i);
            }

            return result;
        }
    }
}
