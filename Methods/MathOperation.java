package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber=Integer.parseInt(scanner.nextLine());
        String operator=scanner.nextLine();
        int secondNumber=Integer.parseInt(scanner.nextLine());
        double resultt=printResult(firstNumber,operator,secondNumber);
//        System.out.printf("%.0f",resultt);
        DecimalFormat printDecimal=new DecimalFormat("0.####");
        System.out.println(printDecimal.format(resultt));

    }
    public static double printResult(int num1,String operator,int num2){
        double result=0;
        switch (operator){
            case "/":
                result=num1 / num2;
                break;
            case "*":
                result=num1 * num2;
                break;
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
        }
        return result;
    }


}
