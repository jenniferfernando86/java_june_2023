package july15;

import java.util.Scanner;

public class MethodParamArgs {
    public static int getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        return sc.nextInt();
    }
    //2 arguments
    public static int addition(int num1, int num2 ) {
        return num1 + num2;
    }

    // 3 arguments
    public static int addition(int num1, int num2, int num3 ) {
        return num1 + num2 + num3;
    }

    public static int sub(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }
    //2 arguments
    public static int multiplication(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    // 3 arguments
    public static int multiplication(int num1, int num2, int num3) {
        int result = num1 * num2 * num3;
        return result;
    }
    public static int division(int num1, int num2) {
        int div = num1 / num2;
        return div;

    }


}
