package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int thirdNum=Integer.parseInt(scanner.nextLine());
        int forthNum=Integer.parseInt(scanner.nextLine());


        int add = firstNum+secondNum;
        int divide=add / thirdNum;
        int multiply=divide * forthNum;

        System.out.println(multiply);
    }
}
