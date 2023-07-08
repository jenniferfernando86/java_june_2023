package july4;

public class Test3 {
    public static void main(String[] args) {
        int x = 12;
        int y = 14;
        int z = 16;

        //1. print the largest

        if((x > y) && (x > z)){
            System.out.println("The largest number is " + x);
        }else if((y > x) && (y > z)){
            System.out.println("The largest number is " + y);
        }else{
            System.out.println("The largest number is " + z);
        }
    }
}
