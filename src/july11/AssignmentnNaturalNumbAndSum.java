package july11;

import java.util.Scanner;

public class AssignmentnNaturalNumbAndSum {
    public static void main(String[] args) {

        System.out.println("First n Natural Numbers : ");
        System.out.println("while loop ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();
        int natNumb = 0;
        int sum = 0;
        while (natNumb <= n) {

            System.out.println(natNumb);
            sum = sum + natNumb;
            natNumb++;
        }
        System.out.println("sum = " + sum);

        //do while
        System.out.println("do while loop ");
        natNumb = 0;
        sum = 0;
        do {

            System.out.println(natNumb);
            sum = sum + natNumb;
            natNumb++;
        }while (natNumb <= n);
        System.out.println("sum = " + sum);

        //for loop
        System.out.println("for loop ");
        sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
