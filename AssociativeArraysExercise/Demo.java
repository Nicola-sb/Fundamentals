package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prdoucts=scanner.nextLine();//Beer 2.20 100
        Map<String,Double>productPrise=new LinkedHashMap<>();
        Map<String,Integer>productQuantity=new LinkedHashMap<>();
        //Създавам си два списъка в който ще си държа цените и количеството
        while (!prdoucts.equals("buy")){
            String product=prdoucts.split(" ")[0];//Beer
            double price=Double.parseDouble(prdoucts.split(" ")[1]);//2.20
            int quantity=Integer.parseInt(prdoucts.split(" ")[2]);

            productPrise.put(product,price);
            //добавям си в мапа продукта
            if(!productQuantity.containsKey(product)){
                //проверявам дали в мапа с Количеството имам такъв продукт и ако нямам го създавам
                productQuantity.put(product,quantity);
            }else{
                productQuantity.put(product,productQuantity.get(product)+quantity);
                //ако имам му задавам нова стойност на продукта,
            }
            prdoucts=scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrise.entrySet()) {
            //key(име на продукта)--> value (цена)
            //цена * количество
            String productName= entry.getKey();
            double finalSum= entry.getValue() * productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n",productName,finalSum);
//            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()*productQuantity.get(entry.getKey()));
        }


    }
}
