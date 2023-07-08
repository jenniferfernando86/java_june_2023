package july4;

import java.util.Scanner;

public class Scannerlargest {
    public static void main(String[] args) {
        //1. print the largest number

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number 1 : ");
        int number1 = sc.nextInt();

        System.out.print("Input the number 2 : ");
        int number2 = sc.nextInt();

        System.out.print("Input the number 3 : ");
        int number3 = sc.nextInt();

        if((number1 > number2) && (number1 > number3)){
            System.out.println("The largest number is " + number1);
        }else if((number2 > number1) && (number2 > number3)){
            System.out.println("The largest number is " + number2);
        }else{
            System.out.println("The largest number is " + number3);
        }

    }
}
