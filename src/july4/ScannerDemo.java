package july4;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in); //created object of scanner class
        System.out.println("Enter the value : ");
        input = scanner.nextInt();

        System.out.print(" input value is :" +input);
        //with x, y, z
        int x;
        int y;
        int sum;

        Scanner scan = new Scanner(System.in); //created object of scanner class
        System.out.print("Enter the first number : ");
        x = scan.nextInt();

        System.out.print("Enter the second number : ");
        y = scan.nextInt();

        sum = x + y;
        System.out.print("Sum of x and y : " + sum);

    }
}
