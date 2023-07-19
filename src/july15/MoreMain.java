package july15;

import java.util.Scanner;

public class MoreMain {
    public static void main(String[] args) {
        System.out.println("To print customer's age or name or salary");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        MoreMethods.getInput(name);

        sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        MoreMethods.getInput(age);

        sc = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        double salary = sc.nextFloat();
        MoreMethods.getInput(salary);
    }

}
