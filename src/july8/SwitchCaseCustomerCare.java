package july8;

import java.util.Scanner;

// customer care application program
// use string 1 Pragra and address

public class SwitchCaseCustomerCare {
    public static void main(String[] args){

        System.out.println(" Welcome to Customer Care to find Address ");
        System.out.print(" Enter the name of the place to get the address : ");

        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();


        switch ( address ) {
            case "pragra": System.out.println(" 110 matheson blvd west, mississauga, L5R 4G7 ");
                break;
            case "cn tower": System.out.println("290 bremner blvd, toronto, M5V 3L9");
                break;
            case "aquarium": System.out.println("288 bremner blvd, toronto, M5V 3L9");
                break;
            case "Pragra": System.out.println(" 110 matheson blvd west, mississauga, L5R 4G7 ");
                break;
            case "CN Tower": System.out.println("290 bremner blvd, toronto, M5V 3L9");
                break;
            case "Aquarium": System.out.println("288 bremner blvd, toronto, M5V 3L9");
                break;
            default: System.out.println(" invalid input ");
            break;
        }

    }
}
