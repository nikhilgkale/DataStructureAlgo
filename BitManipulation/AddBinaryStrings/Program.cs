namespace FindIntOccursOnce
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(addBinary("1", "1"));
        }

        public static String addBinary(String A, String B) {

            string output  = string.Empty;

            char[] cArrA = new char[A.Length];
            cArrA = A.ToCharArray();

            char[] cArrB = new char[B.Length];
            cArrB = B.ToCharArray();

            if(cArrA.Count() > cArrB.Count()){

                int indexB = cArrB.Count() - 1;

                int sum = 0;

                for(int indexA = cArrA.Count() - 1; indexA >= 0; indexA--){
                    
                    int bValue = 0;
                    int aValue = 0;
                    
                    int.TryParse(cArrA[indexA].ToString(), out aValue);

                    if(indexB < 0){
                        sum = sum + aValue;
                    }else{

                        int.TryParse(cArrB[indexB].ToString(), out bValue);

                        sum = sum + aValue + bValue;
                    }

                    output = output + (sum % 2);
                    sum = sum /2;
                    indexB--;
                }
                
                if(cArrA.Count() == cArrB.Count() || sum > 0){
                 output = output + (sum % 2);
                }
                 
            }else{

                int indexA = cArrA.Count() - 1;

                int sum = 0;

                for(int indexB = cArrB.Count() - 1; indexB >= 0; indexB--){
                    
                    int bValue = 0;
                    int aValue = 0;
                    int.TryParse(cArrB[indexB].ToString(), out bValue);
                    

                    if(indexA < 0){
                        sum = sum + bValue;
                    }else{
                        int.TryParse(cArrA[indexA].ToString(), out aValue);
                        sum = sum + bValue + aValue;
                    }
                    
                    Console.WriteLine(sum);

                    output = output + (sum % 2);

                    sum = sum /2;

                    indexA--;
                }
                
                if(cArrA.Count() == cArrB.Count() || sum > 0){
                 output = output + (sum % 2);
                }
            }

            string finalOutput = string.Empty;

            char[] outputstream = output.ToCharArray();  
            int length = output.Length - 1;  

            for (int i = length; i >= 0; i--) {  
                finalOutput = finalOutput + outputstream[i].ToString();
            }  

            return finalOutput;
        }
    }
}


