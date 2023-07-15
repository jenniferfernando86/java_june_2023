package july11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AssignmentGreatestNumber {
    public static void main(String[] args) {
//print the greatest number

        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter your first number");
            int first_number = scanner.nextInt();
            System.out.println("Enter your second number");
            int second_number = scanner.nextInt();
            System.out.println("Enter your third number");
            int third_number = scanner.nextInt();

            if (first_number > second_number && first_number > third_number)
            {
                System.out.println( first_number +  " is greater than " + second_number + " & " + third_number);
            }else if (second_number > third_number) {
                System.out.println(second_number + "is greater than " + first_number + " &" + third_number);
            }
            else{
                System.out.println(third_number + "is greater than " + first_number + " &" + second_number);
            }

            System.out.println("Are you ready to exit");
            System.out.println("Press 1 to continue or any other number to exit");
            input = scanner.nextInt();

        }while(input == 1);
        System.out.println("Thankyou for using this program");


    }
}
