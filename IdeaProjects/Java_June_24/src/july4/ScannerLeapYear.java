package july4;

import java.util.Scanner;

public class ScannerLeapYear {
    public static void main(String[] args) {

        Scanner leap = new Scanner(System.in);
        System.out.print("Input the year : ");

        int year = leap.nextInt();

        //printing if the year is a leap year

        if( year % 4 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
