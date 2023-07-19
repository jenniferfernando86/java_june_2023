package test;

public class HomeAssignment {
    public static void main(String[] args) {

        int x = 15;
        int y = 25;
        x = x + y;
        System.out.println(x); // x = 40
        y = x - y;
        x = x - y;

        System.out.println("Y = " +y); // y = 15
        System.out.println("x = " +x); // x = 25

    }
}
