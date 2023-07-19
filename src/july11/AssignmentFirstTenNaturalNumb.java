package july11;

public class AssignmentFirstTenNaturalNumb {
    public static void main(String[] args) {

        System.out.println("First 10 Natural Numbers : ");
        System.out.println("while loop ");
        int natNumb = 0;
        while (natNumb <= 10) {
            natNumb++;
            System.out.println(natNumb);

        }

        //do while
        System.out.println("do while loop ");
        natNumb = 0;
        do {
            natNumb++;
            System.out.println(natNumb);

        }while (natNumb <= 10);

        //for loop
        System.out.println("for loop ");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
