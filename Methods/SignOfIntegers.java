package Methods;

import java.util.Scanner;

public class SignOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput=Integer.parseInt(scanner.nextLine());

         positiveOrNegativeNumber(numberInput);
    }

    public static void positiveOrNegativeNumber(int number){
        if(number>0){
            System.out.printf("The number %d is positive.",number);
        }else if(number<0){
            System.out.printf("The number %d is negative.",number);
        }else{
            System.out.printf("The number %d is zero.",number);
        }
    }
}
