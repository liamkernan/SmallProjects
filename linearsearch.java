public class linearsearch
{
    public static void main(String[] args)
    {
        
    int[] arr = {2, 4, 10, 11, 13};
    int goal = 4;
    
    for (int i = 0; i < arr.length; i++) {
    if (arr[i] == goal) {
        goal = i;
        break;
            }
        }
    
        System.out.println("Found in the array at indicy: " + goal);
    }
    
    
}