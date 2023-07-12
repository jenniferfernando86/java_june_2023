package july8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Hello");

        /*
        problem 1:
        create a calculator
        using if else ladder or nested if else
        user press 1
        perform add operation
        2- subtraction, 3 - multiplication 4 - division 5 modulous
        any other input --" wrong input "

         */

        /*System.out.println("Welcome to Calculator. ");
        System.out.print("Enter your input 1 : ");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        System.out.print("Enter your input 2 : ");
        int input2  = scan.nextInt();

        System.out.println(" Press 1 for Addition ;\n Press 2 for Subtraction ; \n Press 3 for Multiplication ; \n Press 4 for Division ; \n Press 5 for Modulus ; ");
        int operator  = scan.nextInt();

        if(operator == 1){ // addition
            System.out.println("Sum = " + (input + input2));
        }else if (operator == 2){
            System.out.println("Balance = " + (input - input2));
        }else if (operator == 3){
            System.out.println("Total = " + (input * input2));
        }else if (operator == 4){
            System.out.println("Result = " + (input / input2));
        }else if (operator == 5) {
            System.out.println("Reminder = " + (input % input2));
        }else{ System.out.println("Wrong input");
        }*/
//Problem 2: problem 2:
// take input in character (+, -, *, /)
        System.out.println("Welcome to Calculator. ");
        System.out.print("Enter your input 1 : ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.print("Enter your input 2 : ");
        int input2 = sc.nextInt();

        System.out.println(" Press + for Addition ;\n Press - for Subtraction ; \n Press * for Multiplication ; \n Press / for Division ; \n Press % for Modulus ; ");
        String stoperator  = sc.next();

        if(stoperator.equals("+")){ // addition
            System.out.println("Sum = " + (input + input2));
        }else if (stoperator.equals("-")){
            System.out.println("Balance = " + (input - input2));
        }else if (stoperator.equals("*")){
            System.out.println("Total = " + (input * input2));
        }else if (stoperator.equals("/")){
            System.out.println("Result = " + (input / input2));
        }else if (stoperator.equals("%")) {
            System.out.println("Reminder = " + (input % input2));

        }else{ System.out.println("Wrong input");
        }

    }
}
