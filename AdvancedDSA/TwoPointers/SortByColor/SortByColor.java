package AdvancedDSA.TwoPointers.SortByColor;

public class SortByColor {
    public static void main(String[] args)
    {
        int[] A   = new int[]{ 0, 1, 2, 0, 1, 2 };
        int[] output = sortColors(A);

        System.out.println();
        for(int i=0; i<output.length;i++){
            System.out.print(output[i] + " ");  
        }
    }
    public static int[] sortColors(int[] A) {
        
        int n = A.length;
        int i = 0;
        int j = n-1;
        int currentIndex= 0;//current index

        while(i < j && currentIndex <= j){
            if(A[currentIndex] == 0){
                A[currentIndex] = A[i];//Basically Swapping here
                A[i] = 0;
                currentIndex++;
                i++;
            }else if(A[currentIndex] == 1){
                currentIndex++;
                //1's (white's) will automatically get aligned if we align the other two colors.
            }else{
                A[currentIndex] = A[j];//Basically Swapping here
                A[j] = 2;
                //currentIndex++;// We are not Incrementing the current Index here because 
                //we don't know what we have swapped from the last index 
                //0(red), 1(white), or 2(blue). Hence we will let the next loop take care of that.
                j--;
            }
        }
        return A;
    }
}
