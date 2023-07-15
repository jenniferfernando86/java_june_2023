package july8;

public class TernaryOperator {
    public static void main(String[] args){

        //check if this numb is even or odd
        int number = 10;
        /*
        if(number %2 == 0){
         /*
            System.out.println("number is even");

        }
        else {
            System.out.println("number is odd");
        }
        */
        String result = (number %2 == 0) ? "even": "odd";
        System.out.println(result);

    }
}
