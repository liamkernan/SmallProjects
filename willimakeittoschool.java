import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        boolean RunAgain = true;
        int version = 0;
        
        while (RunAgain) {
        boolean ProgramRunning = true;
        
        version = version + 1;
        int percentchance = 0;
        
        
        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        
        System.out.println("Will I make it to school on time today? Day " + version);
        System.out.println("by Liam Kernan");
        System.out.println("");
        System.out.println("");
        System.out.println("How much caffeine consumed? (mg)");
        int input1 = s.nextInt();
        if (input1 >= 300) {
            percentchance += 35;
        } else if (input1 >= 200) {
            percentchance += 20;
        } else if (input1 >= 100) {
            percentchance += 10;
        }
        System.out.println("");
        System.out.println("How many hours of sleep?");
        int input2 = s.nextInt();
        if (input2 >= 8) {
            percentchance += 25;
        } else if (input2 >= 6) {
            percentchance += 10;
        }
        System.out.println("");
        System.out.println("Is there traffic? Type YES, A LITTLE BIT, OR NO ");
        String input3 = t.nextLine();
        if (input3.equals("NO")) {
            percentchance += 30;
        } else if (input3.equals("A LITTLE BIT")) {
            percentchance += 20;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("There is a " + percentchance + "% chance I make it on time");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Will I be marked late?");
        System.out.println("");
        System.out.println("");
        
        System.out.println("If Mr P is not paying attention:");
        System.out.println("");
        System.out.println("If Mr P is not mad at me:");
        System.out.println("");
        System.out.println("If Mr P is mad at me:");
        System.out.println("");
        System.out.println("");
        
        for (double i = 0.5; i <= 1.5; i += 0.5) {
            int percentchance2 = (int)(percentchance * i);
            if (percentchance2 > 100) {
                percentchance2 = 100;
            }
            System.out.println(percentchance2 + "%");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Would you like to test again? Type YES or NO");
            String input4 = t.nextLine();

            if (input4.equals("NO")) {
                RunAgain = false;
                System.out.println("");
                System.out.println("Goodbye Mr P. Its been a good one!");
            } else {
                System.out.println("On to the next day...");
            }
        System.out.println("");
        System.out.println("");
        }
    }
}