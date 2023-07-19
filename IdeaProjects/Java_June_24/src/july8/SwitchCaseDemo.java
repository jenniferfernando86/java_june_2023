package july8;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args){

        System.out.print(" Welcome to Calculator. ");
        System.out.print(" Enter your input 1 ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.print("Enter your input 2 ");
        int number2  = scan.nextInt();

        System.out.print(" Enter the operation 1 for Addition; 2 for Subtraction; 3 for Multiplication; " +
                "4 for Division  ");
        int operator  = scan.nextInt();

        switch ( operator) {
            case 1: System.out.println("addition = "+ (number1 + number2));
            break;
            case 2: System.out.println("subtraction = "+(number1 - number2));
            break;
            case 3: System.out.println("multiplication = "+(number1 * number2));
                break;
            case 4: System.out.println("division = "+(number1 / number2));
                break;
            default: System.out.println(" invalid input ");
            break;
        }

    }
}
