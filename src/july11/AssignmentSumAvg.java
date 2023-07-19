package july11;

import java.util.Scanner;

public class AssignmentSumAvg {
    public static void main(String[] args) {

        System.out.println("Input 5 numbers from the keyboard : ");
        System.out.println("while loop ");
        Scanner sc = new Scanner(System.in);;

        int natNumb = 0;
        int sum = 0;
        while (natNumb < 5) {
            System.out.print("Enter number : ");
            sum = sum + sc.nextInt();
            natNumb++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum/5);

        //do while
        System.out.println("do while loop ");
        natNumb = 0;
        sum = 0;
        do {
            System.out.print("Enter number : ");
            sum = sum + sc.nextInt();
            natNumb++;

        }while (natNumb < 5);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum/5);

        //for loop
        System.out.println("for loop ");
        sum = 0;
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter number : ");
            sum = sum + sc.nextInt();
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum/5);
    }
}
