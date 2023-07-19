package july11;

import java.util.Scanner;

public class ConsonantAssignment {
    public static void main(String[] args) {

        // using while loop
        System.out.println("To print consonant or vowel");
        char input;
        do {
            System.out.println("Enter a alphabet to check if it is a vowel or a consonant : ");
            Scanner scanner = new Scanner(System.in);

            input = scanner.next().charAt(0);

            if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
                if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'
                        || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
                    System.out.println("The entered alphabet is a Vowel");
                } else {
                    System.out.println("The entered alphabet is a Consonant");
                }
            } else {
                System.out.println("Error: Please enter a valid input only in alphabets");
            }

            System.out.println("Are you ready to exit");
            System.out.print("Press 1 to continue or any other number to exit : ");
            input = scanner.next().charAt(0);

        } while (input == '1');
        System.out.println("Thankyou for using this program");

        //For loop
        System.out.println("\nUsing For Loop");
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter a alphabet to check if it is a vowel or a consonant : ");
            Scanner scanner = new Scanner(System.in);

            input = scanner.next().charAt(0);

            if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
                if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'
                        || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
                    System.out.println("The entered alphabet is a Vowel");
                } else {
                    System.out.println("The entered alphabet is a Consonant");
                }
            } else {
                System.out.println("Error: Please enter a valid input only in alphabets");
            }

            System.out.println("Are you ready to exit");
            System.out.print("Press 1 to continue or any other number to exit : ");
            input = scanner.next().charAt(0);
            if (input == '1') {
                i = -1;
            }

        }
        System.out.println("Thankyou for using this program");

    }
}
