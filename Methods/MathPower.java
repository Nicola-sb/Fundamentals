package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1=Double.parseDouble(scanner.nextLine());
        double num2=Double.parseDouble(scanner.nextLine());

//        double result=sumPow2(num1,num2);
//        System.out.printf("%.0f",result);
        double result= sumPow2(num1,num2);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double sumPow2(double number1,double number2){
        double result=Math.pow(number1,number2);
        return  result;
    }

}
