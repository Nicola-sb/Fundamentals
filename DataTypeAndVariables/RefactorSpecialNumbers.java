package DataTypeAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        boolean toe = false;


        for (int ch = 1; ch <= n; ch++) {
            int num = ch;
            int sum = 0;

            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10;
            }

                if (sum == 5 || sum == 7 || sum == 11) {

                    System.out.printf("%d -> %b%n", num, toe);

                }


        }
    }
}
