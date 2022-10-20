namespace DivisibilityBy8
{
    class Program
    {
        static void Main(string[] args)
        {
        
             Console.WriteLine(solve("23009206674500832504683692645377001772884482337439985158213785047134170462492268515688582172472424888998621502266684722771226362547761512"));
        }

        public static int solve(string A) {
            try{

                int a   = 0;
                int len = A.Length;

                if(A.Length <= 3){
                    a = int.Parse(A);
                }else{
                    a = int.Parse(A.Substring(len-3, 3));
                }
                
                if(a%8 == 0){
                    return 1;
                }else{
                    return 0;
                }
            }
            catch(Exception ex){
                return 10;
            }
        }
    }
}