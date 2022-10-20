namespace ModString
{
    class Program
    {
        static void Main(string[] args)
        {
             Console.WriteLine(findMod("842554936302263", 41));
        }

        public static int findMod(string A, int B) {

            long result  = 0;
            int multiply = 1;
            char[] arr = A.ToCharArray();

            for(int i = arr.Count()-1; i >= 0; i--){

                result = result % B + ((((arr[i]-'0')%B) * (multiply%B))%B);
                multiply = (multiply * 10) % B;
            }

            return (int)result % B;
        }            
    }
 }
