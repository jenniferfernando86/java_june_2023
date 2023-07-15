public class Arithmetic {
    public static void main(String[] args){

        int a = 8; int b = 6;
        int result = subtraction(a,b);
        //subtraction(1,2);
        System.out.println("Subtraction:");
        System.out.println("First Number = "+a);
        System.out.println("Second Number = "+b);
        System.out.println("Subtraction Result = "+result);
        System.out.println("------------------------------------");

        System.out.println("Multiplication:");
        int x = 11; int y = 11;
        result = multiplication(x, y);
        System.out.println("First Number = "+x);
        System.out.println("Second Number = "+y);
        System.out.println ("Multiplication Result = "+result);

        System.out.println("------------------------------------");

        System.out.println("Division:");
        float floatX = 13f; float floatY = 3f;
        float floatResult = division(floatX, floatY);
        System.out.println("First Number = "+floatX);
        System.out.println("Second Number = "+floatY);
        System.out.println ("Division Result = "+floatResult);
    }

    public static int subtraction (int a, int b){
        int x = a - b;
        return x;
    }

    public static int multiplication(int x, int y){
        int z = x * y;
        return z;
    }

    public static float division(float x, float y){
        float z = x / y;
        return z;
    }

}
