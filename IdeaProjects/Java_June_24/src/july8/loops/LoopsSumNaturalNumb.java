package july8.loops;

public class LoopsSumNaturalNumb {
    public static void main(String[] args) {

        System.out.println("Sum of first 10 Natural Numbers : ");
        System.out.println("while loop ");
        int natNumb = 0;
        int sum = 0;
        while (natNumb < 10) {
            natNumb++;
            sum = sum + natNumb;

        }
        System.out.println("sum = " + sum);

        //do while
        System.out.println("do while loop ");
        natNumb = 0;
        sum = 0;
        do {
            natNumb++;
            sum = sum + natNumb;

        }while (natNumb < 10);
        System.out.println("sum = " + sum);

        //for loop
        System.out.println("for loop ");
        sum = 0;
        for(int i = 0; i <= 10; i++){
          sum = sum + i;
        }
        System.out.println("sum = " + sum);
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