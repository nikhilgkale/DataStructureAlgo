namespace FindIntOccursOnce
{
    class Program
    {
        static void Main(string[] args)
        {
            int [] input = {1,2,3,5,5,4,3,2,1};

            //Best Approach - Use XOR operation (A^A=0)
            //Time Complexity  => o(n)
            //Space Complexity => o(1)

            int xor = input[0];

            for(int i = 1; i < input.Length; i++){
                xor = xor ^ input[i];
            }

            Console.WriteLine(xor);

            //------------------------------------------------//

            //Other Approach 1 => Sort and identify pair
            //Time Complexity => o(nlogn) + o(n) = o(nlogn)
            //Space Complexity => o(1)

            // Array.Sort(input);
           
            // for(int i = 0; i < input.Length; i++){

            //     if( i == input.Length -1){
            //         Console.WriteLine(input[i]);
            //         break;
            //     }else{

            //         if(input[i] != input[i+1]){
            //             Console.WriteLine(input[i]);
            //             break;
            //         }else{
            //             i++;
            //         }
            //     }
            // }

            //------------------------------------------------//
            
            //Other Approach 2 : Hashing & Identify Frequency
            //Time Complexity  => o(n) ? o(n) + O(n) = o(n)
            //Space Complexity => o(n) Frequency array

            // Dictionary<int,int> dict = new Dictionary<int, int>();

            // for(int i = 0; i < input.Length; i++){

            //     if(dict.ContainsKey(input[i])){
            //         dict[input[i]]++;
            //     }else{
            //         dict.Add(input[i], 1);
            //     }
            // }

            // foreach(int key in dict.Keys){
            //     if(dict[key] == 1){
            //         Console.WriteLine(key);
            //         break;
            //     }
            // }
        }
    }
}