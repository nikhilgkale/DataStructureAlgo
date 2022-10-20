namespace N_By_3_RepeatNumber
{
    class Program
    {
        static void Main(string[] args)
        {
             //Console.WriteLine(repeatedNumber(new int[]{1, 1, 1, 2, 3, 5, 7 }));
            //Console.WriteLine(repeatedNumber(new int[]{1, 2, 1, 3, 1, 1,5, 7, 8 }));
            Console.WriteLine(repeatedNumber(new int[]{1000727, 1000727, 1000641, 1000517, 1000212, 1000532, 1000727, 1001000, 1000254, 1000106, 1000405, 1000100, 1000736, 1000727, 1000727, 1000787, 1000105, 1000713, 1000727, 1000333, 1000069, 1000727, 1000877, 1000222, 1000727, 1000505, 1000641, 1000533, 1000727, 1000727, 1000727, 1000508, 1000475, 1000727, 1000573, 1000727, 1000618, 1000727, 1000309, 1000486, 1000792, 1000727, 1000727, 1000426, 1000547, 1000727, 1000972, 1000575, 1000303, 1000727, 1000533, 1000669, 1000489, 1000727, 1000329, 1000727, 1000050, 1000209, 1000109}));

        }

        public static int repeatedNumber(int[] A) {
            int count1     = 0;
            int count2     = 0;

            int majority1  = 0;
            int majority2  = 0;

            for(int i=0; i < A.Count(); i++){

                if(count1 == 0){
                    
                    if(A[i] == majority2){
                        count2++;
                    }
                    else{
                        majority1 = A[i];
                        count1    = 1;
                    }
                }else if(A[i] == majority1){
                    count1++;
                }
                else if(count2 == 0){
                    
                    majority2 = A[i];
                    count2    = 1;
                }else{
                    
                    if(A[i] == majority2){
                        count2++;
                    }else{

                        count1--;
                
                        if(count1 == 0){
                            majority1=0;
                        }
                        count2--;
                        if(count2 == 0){
                            majority2=0;
                        }
                    }
                }
                /*
                Console.WriteLine("Loop No : " + i);
                Console.WriteLine(count1);
                Console.WriteLine(majority1);
                Console.WriteLine(count2);
                Console.WriteLine(majority2);
                Console.WriteLine("-------------------------------");*/
            }

           

            if(count1 == 0 && count2 == 0){
                return -1;
            }

            int maj_count1 = 0;
            int maj_count2 = 0;

            for(int i=0; i < A.Count(); i++){
                if(A[i] == majority1){
                    maj_count1++;
                }

                if(A[i] == majority2){
                    maj_count2++;
                }
            }

            if(maj_count1 > maj_count2){

                if(maj_count1 > (A.Count()/3)){
                    return majority1;
                }else{
                    return -1;
                }
            }else{
                if(maj_count2 > (A.Count()/3)){
                    return majority2;
                }else{
                    return -1;
                }
            }
        }
    }
}