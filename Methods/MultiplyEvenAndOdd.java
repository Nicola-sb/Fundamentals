package Methods;

import java.util.Scanner;

public class MultiplyEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(printGetMultiplyEvenAndOddNumbers(Math.abs(n)));
    }
    public static int printGetMultiplyEvenAndOddNumbers(int number){
        //123456

        int evenSum=0;
        int oddSum=0;
        while (number>0){
            int currentNum=number%10;
            if(currentNum % 2==0){
                evenSum=evenSum+currentNum;
            }else{
                oddSum=oddSum+currentNum;
            }
            number=number/10;
        }
        int allSum=evenSum * oddSum;
        return allSum;
    }
}
