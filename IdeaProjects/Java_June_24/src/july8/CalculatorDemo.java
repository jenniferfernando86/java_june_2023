package july8;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String [] args) {

        System.out.println("Welcome to my calculator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        System.out.println("Enter the operation 1 for Addition; 2 for Subtraction; 3 for Multiplication; " +
                "4 for Division  : ");
        //
        int input = scanner.nextInt();

        if(input == 1) {
            //add here
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println(sum);

        }
        else if(input == 2) {
            // subtraction
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

             int sub = num1 - num2;
            System.out.println(sub);

        }
        else if(input == 3) {
            //multiplication
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

            int total = num1 * num2;
            System.out.println(total);

        }
        else if(input == 4) {
            //division
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

            int div = num1 / num2;
            System.out.println(div);

        }
        else{
            System.out.println("wrong input");

        }


    }
}
