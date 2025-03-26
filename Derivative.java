import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        double number = 0;
        String variable = "";
        double exponent = 0;
        System.out.println("Derivative/Integration Solver by Liam Kernan");
        System.out.println();
        System.out.println("Press 1 for Derivative, 2 for Integration:");
        int choice = s.nextInt();
        int choice2 = 0;
        String name = "";
        ArrayList<String> namearr = new ArrayList<String>();
        boolean done = false;
        
    for (int i = 0; done == false; i++){    
        System.out.println();
        System.out.println("Enter base number:");
        number = s.nextDouble();
        System.out.println("Enter variable letter:");
        variable = t.nextLine();
        System.out.println("Enter exponent:");
        exponent = s.nextDouble();
        System.out.println("Your function [f(x)]:");
        printFunction(number, variable, exponent);
        if (choice == 1){
        System.out.println("Derivative [f'(x)]:");
        namearr.add(powerrule(number, variable, exponent));
        } else if (choice == 2){
        System.out.println("Integration [F(x)]:");
        namearr.add(reversepowerrule(number, variable, exponent));
        }
        
        System.out.println();
        System.out.println("1 to add variables, 2 to view full function, 3 to assign a value to variable, 4 to Exit");
        choice2 = s.nextInt();
        if (choice2 == 1){
        System.out.println("Input Next Variable:");
        System.out.println();
        } else if (choice2 == 2){
        for (int j = 0; j < namearr.size(); j++){
            if (j == namearr.size() - 1){
                System.out.print((namearr.get(j)).substring(0, (namearr.get(j).length()) - 2));
            } else {
                System.out.print(namearr.get(j));
            }
        }
        } else if (choice2 == 3){
            double assigned = s.nextDouble();
            
        } else if (choice2 == 4){
            done = true;
        }
        
    }
    
    }
    
    public static String product(ArrayList<String> namearr, String num){
        for (int z = 0; z < namearr.size(); z++){
            String rebuilder = namearr.get(z);
           for (int k = 0; k < rebuilder.length(); k++){
            String r = rebuilder.substring(k, k+1);
            if (r.equals("a") || r.equals("b") || r.equals("c") || r.equals("d")){
                r = num;
            }
            }
        }
        
        return "In-Progress";
    }
    
    public static String printFunction(double n, String v, double e){
        if (e == 0){
        System.out.println();
        System.out.println(n);
        System.out.println();
        return n + "";
        } else {
        System.out.println();
        System.out.println("      " + e);
        System.out.println(n + "" + v);
        System.out.println();
        if (n > 0){
        return n + "" + v + "^" + e + " + ";
        } else {
        return n + "" + v + "^" + e;
        }
        }
    }
    
    public static String powerrule(double n, String v, double e){
        n *= e;
        e--;
        return printFunction(n, v, e);
    }
    
    public static String reversepowerrule(double n, String v, double e){
        e++;
        n /= e;
        return printFunction(n, v, e);
    }
}