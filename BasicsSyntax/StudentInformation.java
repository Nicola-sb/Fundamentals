package BasicsSyntax;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        double grade=Double.parseDouble(scanner.nextLine());

        String output=String.format("Name: %s, Age: %d, Grade: %.2f",studentName,age,grade);

        System.out.println(output);

        System.out.println();


    }
}
