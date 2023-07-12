package july11;

import java.util.Scanner;

public class ControlStatemntsDemo {
    public static void main(String[] args) {
//print the hello world - 10 times

        int counter=0;
        while(counter < 10){
            counter ++;
            System.out.println("Hello World");
        }
        //print number 1 - 10

        while(counter < 10){
            counter ++;
            System.out.println(counter);

        }

        //do while - print natural numb with a limit added by user
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your limit");
        int numb = scanner.nextInt();
        int counter = 0;

        do{
            System.out.println(counter);
            counter++;
        }while (counter < numb);*/



    }
}
