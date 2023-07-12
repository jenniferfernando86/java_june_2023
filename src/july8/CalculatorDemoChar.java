package july8;

import java.util.Scanner;

public class CalculatorDemoChar {
    public static void main(String [] args) {

        System.out.println("Welcome to my calculator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        System.out.println("Enter the operation + for Addition; - for Subtraction; * for Multiplication; " +
                "/ for Division  : ");
        //
        char ch = scanner.next().charAt(0);
        //

        if(ch == '+') {
            //add here
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println(sum);

        }
        else if(ch == '-') {
            // subtraction
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

             int sub = num1 - num2;
            System.out.println(sub);

        }
        else if(ch == '*') {
            //multiplication
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

            int total = num1 * num2;
            System.out.println(total);

        }
        else if(ch == '/') {
            //division
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

            int div = num1 / num2;
            System.out.println(div);

        }
        else if(ch == '%') {
            //modulus
            System.out.println("Enter the first number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            int num2 = scanner.nextInt();

            int rem = num1 / num2;
            System.out.println(rem);

        }
        else{
            System.out.println("wrong input");

        }

    }
}
