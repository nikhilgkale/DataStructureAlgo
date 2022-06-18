namespace BitCompression
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(compressBits(new int[]{1,3,5}));
        }

        public static int compressBits(int[] A) {
            int result =0;

            for(int i=0; i < A.Length; i++){
                
                if(i+1 < A.Length){

                    int temp = A[i];
                    A[i]     = A[i] & A[i+1];
                    A[i+1]   = temp | A[i+1];
                }
            }

            for(int i=0; i < A.Length; i++){
                result = result ^ A[i];
            }
            return result;
        }
    }
}