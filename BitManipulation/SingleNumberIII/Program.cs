namespace SingleNumberIII
{
    class Program
    {
        static void Main(string[] args)
        {
            //solve(new int[]{408, 478, 74, 624, 74, 204, 705, 624, 337, 408, 478, 204});
             solve(new int[]{501, 501, 441, 805, 1098, 1833, 1098, 253, 927, 580, 1524, 1903, 1367, 1659, 1213, 253, 805, 1903, 1367, 131, 441, 131, 1524, 1659, 1213, 732, 927, 580});
        }

        public static int[] solve(int[] A) {
            int x = 0;
            int y = 0;

            int xor = 0;

            for(int i = 0; i < A.Length; i++){

                xor = xor ^ A[i];
            }

            int mask = (xor & (xor -1)) ^ xor;

            for(int i = 0; i < A.Length; i++){
                
                if((A[i] & mask) == 0){
                    x = x^A[i];
                }else{
                    y = y^A[i];
                }
            }

            if(x < y){
                Console.WriteLine(x);
                Console.WriteLine(y);
                return new int[]{x,y};
            }else{
                
                Console.WriteLine(y);
                Console.WriteLine(x);
                return new int[]{y,x};
            }
        }
    }
}
 