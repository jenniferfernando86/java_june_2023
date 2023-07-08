public class Student {
    public static void main(String[] args) {
        int age = 24;
        String name = "Pragra";
        long population = 1234_343_434_343l;
        double salary = 20000.232;
        float bonus = 121212.12f;
        char letter = 'A';
        boolean isRaining = true;
        int a = 1; int b = 2;
        int c = addition(a,b);



        System.out.println(age);
        System.out.println(name);
        System.out.println(population);
        System.out.println(salary);
        System.out.println(bonus);
        System.out.println(letter);
        System.out.println(isRaining);
        System.out.println(c);
        System.out.println(addition( a, b, c));

    }

    public static int addition(int a, int b){
        int c = a + b;
        return c;

    }
    public static int addition(int a, int b,int c){
        return (a + b + c);
    }

}
