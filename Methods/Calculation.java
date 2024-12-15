package Methods;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actionInput = scanner.nextLine();
        int firstNum1=Integer.parseInt(scanner.nextLine());
        int secondNum2=Integer.parseInt(scanner.nextLine());

        switch (actionInput){
            case "add":
                printAdd(firstNum1,secondNum2);
                break;
            case "multiply":
                printMultiply(firstNum1,secondNum2);
                break;
            case "subtract":
                printSubtract(firstNum1,secondNum2);
                break;
            case "divide":
                printDivide(firstNum1,secondNum2);
                break;
        }
    }
    public static void printAdd(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
    public static void printMultiply(int num1,int num2){
        int result = num1 * num2;
        System.out.println(result);
    }
    public static void printSubtract(int num1,int num2){
        int result = num1 - num2;
        System.out.println(result);
    }
    public static void printDivide(int num1,int num2){
        int result = num1 / num2;
        System.out.println(result);
    }
}
