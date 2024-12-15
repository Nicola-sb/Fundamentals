package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prdoucts=scanner.nextLine();//Beer 2.20 100
        //продукт--> обща цена (бр. * ед.цена)
        Map<String,Double> productPrise=new LinkedHashMap<>();
        Map<String,Integer>productQuantity=new LinkedHashMap<>();
        while (!prdoucts.equals("buy")){
            String product=prdoucts.split(" ")[0];//Beer
            double price=Double.parseDouble(prdoucts.split(" ")[1]);//2.20
            int quantity=Integer.parseInt(prdoucts.split(" ")[2]);

            productPrise.put(product,price);

            if(!productQuantity.containsKey(product)){
                productQuantity.put(product,quantity);
            }else{
                productQuantity.put(product,productQuantity.get(product)+quantity);
            }
            prdoucts=scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrise.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()*productQuantity.get(entry.getKey()));
        }

    }
}
