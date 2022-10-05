import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class App{
    static final Scanner inputScanner = new Scanner(System.in);
    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextLine();
    }
    
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }
    public static void main(String[] args) {
        double num1 = getDouble("Pick a number.");
        double num2 = getDouble("Pick a second number.");
        // System.out.println(String.format("You want to add %.2f and %.2f", num1,num2));
        Calculator calcOne = new Calculator();
        String operation;
        switch(operation){
            case "add": calcOne.add(num1, num2);
            break;
            case "subtract": calcOne.subtract(num1, num2);
            break;
            case "multiply": calcOne.multiply(num1, num2);
            break;
            case "divide": calcOne.divide(num1, num2);
            break;

        }




        double answer = calcOne.add(num1, num2);
        System.out.println(answer);
        System.out.println(calcOne.subtract(num1, num2));
        System.out.println(calcOne.multiply(num1, num2));
        System.out.println(calcOne.divide(num1, num2));
    }



}