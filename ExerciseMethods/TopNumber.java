package ExerciseMethods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
        if(isDidig(i)&& isSumDecimalTo8(i)){
            System.out.println(i);
        }
    }
    }

    private static boolean isSumDecimalTo8(int number){
        int sum=0;
        while (number > 0){
            int digit=number % 10;
            sum=sum+digit;
            number=number/10;
        }
        return sum % 8==0;
    }
    private static boolean isDidig(int number){
        while (number>0){
            int didig=number % 10;
            if(didig % 2==1){
                return true;
            }
            number=number/10;
        }
        return false;
    }


}
