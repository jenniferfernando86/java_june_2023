package july4;

public class Test2 {
    public static void main(String[] args) {

        //1. check if the number is positive or negative
        int x = -0;

        if(x >= 0){
            System.out.println("x is a positive number " + x);
        }else{
            System.out.println("x is a negative number " + x);
        }

        //2. check if the number is odd or even

        x = 3;

        if(x % 2 == 0){
            System.out.println("x is an even number " + x);
        }else{
            System.out.println("x is an odd number " + x);
        }

        //3. check if the year is leap year

        x = 2023;

        if(x % 4 == 0){
            System.out.println("x is a leap year " + x);
        }else{
            System.out.println("x is not a leap year " + x);
        }

    }
}
