Methods.java:
------------
public class Methods {

    public String write(String input1) {
        if (input1.length() > 6) {
            return input1.substring(6).trim();
        } else {
            return "Error: 'write' requires a message after the command.";
        }
    }

    public int add(String input1) {
        return math(input1, '+');
    }

    public int subtract(String input1) {
        return math(input1, '-');
    }

    public int multiply(String input1) {
        return math(input1, '*');
    }

    public int divide(String input1) {
        String[] parts = input1.split(" ");
        if (parts.length >= 3) {
            try {
                int int10 = Integer.parseInt(parts[1]);
                int int20 = Integer.parseInt(parts[2]);
                if (int20 == 0) {
                    System.out.println("Error: Division by zero is undefined.");
                    return 0; 
                }
                return int10 / int20;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid integers.");
            }
        } else {
            System.out.println("Error: 'divide' requires two integers.");
        }
        return 0;
    }

    public int square(String input1) {
        String[] parts = input1.split(" ");
        if (parts.length >= 2) {
            try {
                int number = Integer.parseInt(parts[1]);
                return number * number;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
            }
        } else {
            System.out.println("Error: 'square' requires a single integer.");
        }
        return 0;
    }

    public String merge(String input1) {
        String[] parts = input1.split(" ", 3);
        if (parts.length >= 3) {
            return parts[1] + " " + parts[2];
        } else {
            return "Error: 'merge' requires two strings.";
        }
    }

    public String reverse(String input1) {
        if (input1.length() > 8) {
            String text = input1.substring(8).trim();
            return new StringBuilder(text).reverse().toString();
        } else {
            return "Error: 'reverse' requires a string after the command.";
        }
    }

    public String uppercase(String input1) {
        if (input1.length() > 10) {
            String text = input1.substring(10).trim();
            return text.toUpperCase();
        } else {
            return "Error: 'uppercase' requires a string after the command.";
        }
    }

    public int length(String input1) {
        if (input1.length() > 7) {
            String text = input1.substring(7).trim();
            return text.length();
        } else {
            System.out.println("Error: 'length' requires a string after the command.");
            return 0;
        }
    }

    public String contains(String input1) {
        String[] parts = input1.split(" ", 3);
        if (parts.length >= 3) {
            String str1 = parts[1];
            String str2 = parts[2];
            return str1.contains(str2) ? "True" : "False";
        } else {
            return "Error: 'contains' requires two strings.";
        }
    }

    private int math(String input1, char operation) {
        String[] parts = input1.split(" ");
        if (parts.length >= 3) {
            try {
                int int10 = Integer.parseInt(parts[1]);
                int int20 = Integer.parseInt(parts[2]);
                switch (operation) {
                    case '+':
                        return int10 + int20;
                    case '-':
                        return int10 - int20;
                    case '*':
                        return int10 * int20;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid integers.");
            }
        } else {
            System.out.println("Error: The command requires two integers.");
        }
        return 0;
    }
}

MyProgram.java:
--------------
import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        Methods methods = new Methods();
        Scanner s = new Scanner(System.in);
        ArrayList<String> output = new ArrayList<>();
        boolean complete = false;

        System.out.println("LIAM LANGUAGE / Liam Compiler");
        System.out.println();
        System.out.println("This simulates a limited Java compiler. Press Enter to save liam code in. Type /run to compile your code.");
        System.out.println();
        System.out.println("To view the documentation, type DOCS");
        System.out.println();

        while (!complete) {
            String input = s.nextLine();

            if (input.length() >= 3 && input.startsWith("add")) {
                int result = methods.add(input);
                output.add("Result (add): " + result);
            } else if (input.startsWith("subtract")) {
                int result = methods.subtract(input);
                output.add("Result (subtract): " + result);
            } else if (input.startsWith("multiply")) {
                int result = methods.multiply(input);
                output.add("Result (multiply): " + result);
            } else if (input.startsWith("divide")) {
                int result = methods.divide(input);
                output.add("Result (divide): " + result);
            } else if (input.startsWith("square")) {
                int result = methods.square(input);
                output.add("Result (square): " + result);
            } else if (input.startsWith("merge")) {
                String result = methods.merge(input);
                output.add("Result (merge): " + result);
            } else if (input.startsWith("reverse")) {
                String result = methods.reverse(input);
                output.add("Result (reverse): " + result);
            } else if (input.startsWith("uppercase")) {
                String result = methods.uppercase(input);
                output.add("Result (uppercase): " + result);
            } else if (input.startsWith("length")) {
                int result = methods.length(input);
                output.add("Result (length): " + result);
            } else if (input.startsWith("contains")) {
                String result = methods.contains(input);
                output.add("Result (contains): " + result);
            } else if (input.startsWith("write")) {
                String message = methods.write(input);
                output.add("Output: " + message);
            } else if (input.equals("/run")) {
                System.out.println();
                System.out.println("[Compiling your program...]");
                System.out.println();
                for (String result : output) {
                    System.out.println(result);
                }
                System.out.println();
                
            } else if (input.equals("/crash")) {
                System.out.println();
                System.out.println("[CRASHING!]");
                break;
                
            } else if (input.equals("DOCS")) {
                System.out.println();
                System.out.println("Documentation:");
                System.out.println("1. add <num1> <num2>       - Add two numbers.");
                System.out.println("2. subtract <num1> <num2>  - Subtract two numbers.");
                System.out.println("3. multiply <num1> <num2>  - Multiply two numbers.");
                System.out.println("4. divide <num1> <num2>    - Divide two numbers.");
                System.out.println("5. square <num>            - Calculate the square of a number.");
                System.out.println("6. merge <str1> <str2>     - Merge two strings.");
                System.out.println("7. reverse <string>        - Reverse a string.");
                System.out.println("8. uppercase <string>      - Convert a string to uppercase.");
                System.out.println("9. length <string>         - Find the length of a string.");
                System.out.println("10. contains <str1> <str2> - Check if your first string contains the second string.");
                System.out.println("11. write <text>           - Display text.");
                System.out.println("12. /run                   - Compile and display all outputs.");
                System.out.println("13. /crash                 - End the program.");
                System.out.println();
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}

