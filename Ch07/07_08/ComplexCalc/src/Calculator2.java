import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /):");

        double result = 0;
        // we want this variable to be available for the entire main method

        try {
            switch (op) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = subtractValues(s1, s2);
                    break;
                case "*":
                    result = multiplyValues(s1, s2);
                    break;
                case "/":
                    result = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
                    // return sta leaves the main method and finishes the app
            }

            System.out.println("The answer is " + result);
            // 4 kere print etmemiz gerekmedi

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
            // with "e.getMessage()" we are printing the exception object's message
            // to get the specific value that wasn't parsable
        }
    }

    private static double addValues(String s1, String s2) {
    	// when we call the parseDouble method we might get an exception
    	// and since we don't handle the exception at this level
    	// the exception bubbles up through the call stack
    	// and then we would have to handle it there
    	// and that's where we place our catch block, at the top level of the code
    	// so we would only have to handle exception once even though it might  
    	// happen in any of the four methods
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
        // returns the user's input
    }

}
