package july15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator using methods");

        int input1 = MethodParamArgs.getinput();

        int input2 = MethodParamArgs.getinput();

        System.out.println("Sum of two numbers = " + MethodParamArgs.addition(input1, input2));
        System.out.println("Balance = " + MethodParamArgs.sub(input1, input2));

        //Switch case char calculator
        System.out.println("Calculator using switch case");

        input1 = MethodParamArgs.getinput();

        input2 = MethodParamArgs.getinput();
        System.out.print("Enter the operation 1 for Addition; 2 for Subtraction; 3 for Multiplication; " +
                "4 for Division  : ");
        int operator  = MethodParamArgs.getinput();
        switch ( operator) {
            case 1: System.out.println("addition = " + MethodParamArgs.addition(input1, input2));
                break;
            case 2: System.out.println("subtraction = " + MethodParamArgs.sub(input1, input2));
                break;
            case 3: System.out.println("multiplication = " + MethodParamArgs.multiplication(input1, input2));
                break;
            case 4: System.out.println("division = " + MethodParamArgs.division(input1, input2));
                break;
            default: System.out.println(" invalid input ");
                break;
        }
    }

}
