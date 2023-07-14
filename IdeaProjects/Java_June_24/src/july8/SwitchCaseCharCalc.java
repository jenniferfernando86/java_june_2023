package july8;

import java.util.Scanner;

public class SwitchCaseCharCalc {
    public static void main(String[] args){

        System.out.println(" Welcome to Character Calculator. ");
        System.out.print(" Enter your first input : ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.print("Enter your second input : ");
        int number2  = scan.nextInt();

        System.out.print(" Enter the operation + for Addition; - for Subtraction; * for Multiplication; " +
                "/ for Division  : ");
        String operator  = scan.next();

        switch ( operator) {
            case "+": System.out.println("addition = "+ (number1 + number2));
            break;
            case "-": System.out.println("subtraction = "+(number1 - number2));
            break;
            case "*": System.out.println("multiplication = "+(number1 * number2));
                break;
            case "/": System.out.println("division = "+(number1 / number2));
                break;
            default: System.out.println(" invalid input ");
            break;
        }

    }
}
