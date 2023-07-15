package july8.loops;

public class Loops2table {
    public static void main(String[] args) {

        //while loop
        System.out.println("\nwhile loop");
        System.out.println("Table of 2 :");
        int productTable = 0;
        while (productTable < 10) {
            productTable++;
            System.out.println("2 x " + productTable + " = " + (2 * productTable));
        }

        //do while loop
        System.out.println("\ndo while loop");

        System.out.println("Table of 2 :");

        productTable = 0;
        do {
            productTable++;
            System.out.println("2 x " + productTable + " = " + (2 * productTable));
        } while (productTable < 10);


            //for loop
        System.out.println("\nfor loop ");
        System.out.println("Table of 2 :");
        productTable = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }

}
// table of 2, product table , 2* 1 = 2
//print sum of first 10 numbers

// why we need it ?
        /*
        loops
        1. while loop - while : checks the condition first and then execute the statement
        2. do-while - first execute the statemnt and then checks the condition (atleast it will run once)
        3. for loop (assignment, condition  , increment/decrement)
        4. for each
        password/ out of stock/
         */