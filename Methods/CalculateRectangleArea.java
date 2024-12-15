package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width=Double.parseDouble(scanner.nextLine());
        double lenght=Double.parseDouble(scanner.nextLine());

        double area=printAreaTriangle(width,lenght);
        System.out.printf("%.0f",area);
    }


    public static double printAreaTriangle(double width,double lenght){
        double area=width*lenght;
        return area;
    }
}
