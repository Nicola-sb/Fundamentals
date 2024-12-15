package BasicsSyntax;

import java.util.Scanner;

public class RefactorSumOfOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        int sum=1;
//НЕ е решенааа!!!
        for(int i=0;i<=number ;i++){
            System.out.print(2 * i + 1);
            sum+=2 * i;

        }
        System.out.printf("Sum: %d%n",sum);

    }
}
