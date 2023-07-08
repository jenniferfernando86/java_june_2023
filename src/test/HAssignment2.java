package test;

public class HAssignment2 {
    public static void main(String[] args) {

        int x = 15;
        int y = 25;
        y = (x + y) - (x = y);

        System.out.println("y = " +y);
        //x = x - y;
        System.out.println("x = "+ x);

    }
}
