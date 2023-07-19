package july18;

public class CalculateArea {

    static double pi = 3.14;
    double radius = 12;
    //method here to calculate area

    /*public CalculateArea() {
    }*/

    public CalculateArea(double radius) {
        this.radius = radius;
    }

    public double area(double input) {
        return( pi * radius * input);
    }

    public static void main(String[] args) {
        //print the area
        CalculateArea ca = new CalculateArea(10);
        System.out.println("Area of the circle is = " + ca.area(11));

        /*CalculateArea ca1 = new CalculateArea();
        System.out.println("Area of the circle is = " + ca1.area());*/
    }
}
