package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfDidigitWihString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num=scanner.nextLine();

        int sum=0;
        for(int i=0;i<=num.length()-1 ;i++){
            char currentNum=num.charAt(i);

            int numberOne=Integer.parseInt(String.valueOf(currentNum));

            sum=sum+numberOne;

        }

        System.out.printf("%d",sum);
    }
}
