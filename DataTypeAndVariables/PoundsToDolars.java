package DataTypeAndVariables;

import java.util.Scanner;

public class PoundsToDolars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPound=Double.parseDouble(scanner.nextLine());
        double dolars = britishPound * 1.36;

        System.out.printf("%.3f",dolars);
    }
}
