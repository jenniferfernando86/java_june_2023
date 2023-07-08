package july4;

import java.util.Scanner;

public class ScannerWeekdays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the day : ");

        int day = scan.nextInt();

        //1. print the name of the day

        if(day == 1){
            System.out.println("Sunday");
        }else if(day == 2){
            System.out.println("Monday");
        }else if(day == 3){
            System.out.println("Tuesday");
        }else if(day == 4){
            System.out.println("Wednesday");
        }else if(day == 5){
            System.out.println("Thursday");
        }else if(day == 6){
            System.out.println("Friday");
        }else if(day == 7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
