package DataTypeAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());



        for(int i=1;i<=number ;i++) {
            int digit = i;
            int allSum=0;

            while (digit > 0) {
            allSum=allSum + digit % 10;

                digit = digit / 10;
            }
            if(allSum==5 || allSum == 7 || allSum == 11){
                System.out.printf("%d -> True%n",i);
            }else{
                System.out.printf("%d -> False%n",i);
            }
        }

    }
}
