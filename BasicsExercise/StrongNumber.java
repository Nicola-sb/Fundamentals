package BasicsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());
        int startNumber=number;

        int sum=0;
        while (number !=0){
            int digit=number % 10;


            int factoriel=1;
            for(int i=1;i<=digit ;i++){
              factoriel=factoriel * i;
            }
            sum=sum + factoriel;
            number=number/10;

        }

        if(startNumber==sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
