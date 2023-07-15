package june27;

public class AssignmentDemo {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int temp; //declaration

        temp = x; // x: 10, temp: 10
        x = y; // y: 20, x takes the value of y which is 20
        y = temp; // temp : 10, y : 10 as it is swapped

        System.out.println("X : " +x);
        System.out.println("X : " +y);

        /*
        home assignment ?
        1. swap two numbers without using a third variable
        x: 15, y : 25
        after swap : x : 25, y : 15
        you cannot use 3rd variable (dont use temp variable)

        2. swap using two variables but in single statement
        (x + y) - x;
         */





        /*
        swap values
        before : x = 10 , y = 20;
        operation
        after y = 10 , x = 20;

         */
    }
}
