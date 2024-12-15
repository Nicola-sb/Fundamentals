package DataTypeAndVariables;

import java.util.Scanner;

public class ConvertMetresToKilometres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metres=Integer.parseInt(scanner.nextLine());

        double kilometres=metres * 1.0 / 1000;

        System.out.printf("%.2f",kilometres);
    }
}
