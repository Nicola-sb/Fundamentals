package DataTypeAndVariables;

import java.util.Scanner;

public class TownInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name=scanner.nextLine();
        int population=Integer.parseInt(scanner.nextLine());
        double area=Double.parseDouble(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.",name,population,area);
    }
}
