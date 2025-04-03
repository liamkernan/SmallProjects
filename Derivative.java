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
        ArrayList<String> components = new ArrayList<String>();
        
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
        System.out.println("Derivative [f'(x)]:4");
        components.add(String.valueOf((number * exponent)));
        components.add(variable);
        components.add(String.valueOf(exponent - 1));
        namearr.add(powerrule(number, variable, exponent));
        } else if (choice == 2){
        System.out.println("Integration [F(x)]:");
        components.add(String.valueOf((number * exponent)));
        components.add(variable);
        components.add(String.valueOf(exponent - 1));
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
            System.out.println();
            System.out.println("Enter value: ");
            System.out.println();
            double assigned = s.nextDouble();
            System.out.println(product(components, assigned));
            
        } else if (choice2 == 4){
            done = true;
        }
        
    }
    
    }
    
    public static int product(ArrayList<String> grah, double num){
        
        int total = 0;
        
        for (int k = 0; k < grah.size(); k += 3){
            double replace1 = Double.parseDouble(grah.get(k));
            double replace3 = Double.parseDouble(grah.get(k + 2));
            double replace2 = Math.pow(num, replace3);
            
            total += replace1 * replace2;
            
        }
        
        return total;
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
