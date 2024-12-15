package ExerciseMethods;

import java.util.Scanner;

public class FactorielOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());

        long firstFactorile=printFactoriel(number1);
        long secondFactoriel=printFactoriel(number2);
        double result = firstFactorile * 1.0 / secondFactoriel;
        System.out.printf("%.2f",result);

    }

    public static long printFactoriel(long number1){
        long factorile=1;
        for(int i=1 ;i<=number1 ;i++){
            long currentNumber=i;
            factorile=factorile*currentNumber;
        }
        return factorile;
    }
}
