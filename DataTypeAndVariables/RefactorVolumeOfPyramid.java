package DataTypeAndVariables;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // 0 tochki

        double lenght=Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");

        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");

        double heiht = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");

        double obem=(lenght * width * heiht)  / 3;

        System.out.printf("Pyramid Volume: %.2f", obem);


    }
}
