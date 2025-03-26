public class MyProgram
{
    public static void main(String[] args)
    {
        //values have to be sorted first
        int []arr = {2, 5, 10, 13, 23, 27, 41};
        int goal = 41;
        int low = 0;
        int high = arr.length - 1;
        
        
        for (int i = 0; low <= high; i++){
        
        int half = low + (high - low) / 2;
            if (goal > arr[half]) {
                low = half + 1;
                System.out.println(arr[half]);
            } 
            else if (goal < arr[half]){
                high = half - 1;
                System.out.println(arr[half]);
            }
            else {
                System.out.println("FOUND! " + arr[half] + " at index " + half);
                return;
            }
        }
        
    }
}