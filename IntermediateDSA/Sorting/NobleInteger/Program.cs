namespace NobleInteger
{
    class Program
    {
        static void Main(string[] args)
        {
             //Console.WriteLine(solve(new int[]{1, 2, 7, 0, 9, 3, 6, 0, 6 }));
             Console.WriteLine(solve(new int[]{7, 9, 2, 0, 2, 3, 7, 5 }));
        }

        public static int solve(int[] A) {

            int result = -1;
            int count  = 0;
            int temp   = 0;

            Array.Sort(A);

            for(int i = A.Count() - 1; i >= 0; i--){
                
                if(i == A.Count() - 1){
                    temp = i;

                    if(A[i] == A.Count() - (i+1)){
                        count++;
                        Console.WriteLine("For Max: " + A[i]);
                    }
                }
                else if(A[i] != A[i+1]){
                    temp = A.Count() - (i+1);

                    if(A[i] == A.Count() - (i+1)){
                        count++;
                        Console.WriteLine("For i+1: " + A[i]);
                    }

                }else{

                    if(A[i] == temp){
                        count++; 
                        Console.WriteLine("For temp: " + A[i]);
                    }
                }
            }

            if(count>0){
                result = 1;
                
            }

            return result;
        }
    }
}
