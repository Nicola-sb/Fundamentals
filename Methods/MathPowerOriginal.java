package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPowerOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1=Double.parseDouble(scanner.nextLine());
        double num2=Double.parseDouble(scanner.nextLine());
        double result=mathPower(num1,num2);
        DecimalFormat df=new DecimalFormat("0.####");
        System.out.println(df.format(result));

    }
    public static double mathPower(double number1,double number2){
        double result=1;
        for(int i=1 ;i<=number2 ;i++){
            result=result * number1;
        }
        return result;
    }
}
