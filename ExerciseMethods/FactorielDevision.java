package ExerciseMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorielDevision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        double result=firstNumber(number1) * 1.0 / secondNumber(number2);
        System.out.printf("%.2f",result);
    }

    public static long firstNumber(int numberOne){
        long factorileFirst=1;
        for(int i=1 ;i<=numberOne ;i++){
            int currentNumber=i;
            factorileFirst=factorileFirst * currentNumber;
        }
        return factorileFirst;
    }
    public static long secondNumber(int numberOne){
        long factorileSecond=1;
        for(int i=1 ;i<=numberOne ;i++){
            int currentNumber=i;
            factorileSecond=factorileSecond * currentNumber;
        }
        return factorileSecond;
    }
}
