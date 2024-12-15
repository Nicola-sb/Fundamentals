package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        double priceWithoutTaxes=0;
        while (!command.equals("special")&&!command.equals("regular")){
            double pricesParts=Double.parseDouble(command);

            if(pricesParts<0){
                System.out.println("Invalid price!");
                command=scanner.nextLine();
                continue;
            }
            priceWithoutTaxes=priceWithoutTaxes+pricesParts;
            command=scanner.nextLine();
        }

        if(priceWithoutTaxes==0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            double taxes = priceWithoutTaxes * 0.20;
            double midPrise = priceWithoutTaxes + taxes;
            double finalPrise = midPrise * 0.90;
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            if (command.equals("special")) {
                System.out.printf("Total price: %.2f$", finalPrise);
            }else{
                System.out.printf("Total price: %.2f$",midPrise);
            }
        }
    }
}
