public class MyProgram
{
    public static void main(String[] args)
    {
        int[] arr = {2, 8, 7, 1, 9, 4};
        int t = 0;
        
        for (int k = 0; k < arr.length; k++){
            int z = k;
        for (int i = k + 1; i < arr.length; i++){
            if (arr[i] < arr[z]){
                z = i;
            }
        }
        t = arr[k];
        arr[k] = arr[z];
        arr[z] = t;
        }
        
        for (int a = 0; a < arr.length; a++){
            System.out.print(arr[a] + ", ");
        }
        
    }
}