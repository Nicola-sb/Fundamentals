package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product=scanner.nextLine();
        int quantity=Integer.parseInt(scanner.nextLine());
        double priseOneproduct=0;
        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00
        switch (product){
            case "coffee":
                priseOneproduct=1.50;
                printResult(quantity,priseOneproduct);
                break;
            case "water":
                priseOneproduct=1.00;
                printResult(quantity,priseOneproduct);
                break;
            case "coke":
                priseOneproduct=1.40;
                printResult(quantity,priseOneproduct);
                break;
            case "snacks":
                priseOneproduct=2.00;
                printResult(quantity,priseOneproduct);
                break;
        }
    }
    public static void printResult(int quantity,double priceOneproduct){
        double result=quantity*priceOneproduct;
        System.out.printf("%.2f",result);
    }
}
