package Methods;

import java.util.Scanner;

public class MultiplyEvenAndOddOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(printResult(Math.abs(n)));

    }


    public static int printResult(int number){
        int evenSum=evenSum(number);
        int oddSum=oddSum(number);
        return evenSum*oddSum;
    }

    public static int evenSum(int number){
        int evenSum=0;
        while (number>0){
            int currentDigit=number % 10;
            if(currentDigit % 2==0){
                evenSum=evenSum+currentDigit;
            }
            number=number/10;
        }
        return evenSum;
    }
    public static int oddSum(int number){
        int oddSum=0;
        while (number>0){
            int currentDigit=number%10;
            if(currentDigit % 2 ==1){
                oddSum=oddSum+currentDigit;
            }
            number=number/10;
        }
        return oddSum;
    }
}
