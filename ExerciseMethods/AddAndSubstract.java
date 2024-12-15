package ExerciseMethods;

import java.util.Scanner;

public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        int number3=Integer.parseInt(scanner.nextLine());
        printSum(number1,number2,number3);
    }

    public static void printSum(int numberOne,int numberTwo,int numberThree){
        int sum=0;
        sum=numberOne+numberTwo;
        int finalSum=sum-numberThree;
        System.out.println(finalSum);
    }
}
