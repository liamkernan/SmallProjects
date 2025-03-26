public class MyProgram
{
    public static void main(String[] args)
    {
        int[] yeahh = {2, 4, 1, 9, 5, 3, 7, 6, 8};
        int z = 0;
        int counter = 0;
        
        for (int j = 0; j < 100; j++){
            
        for (int i = 1; i < yeahh.length; i++){
            if (yeahh[i] < yeahh[i - 1]){
                z = yeahh[i];
                yeahh[i] = yeahh[i - 1];
                yeahh[i - 1] = z;
            } 
        }
        
        }
        
        for (int i = 0; i < yeahh.length; i++){
            System.out.print(yeahh[i] + ", ");
        }
        
    }
}