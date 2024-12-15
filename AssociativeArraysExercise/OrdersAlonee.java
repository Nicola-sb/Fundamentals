package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



public class OrdersAlonee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String,Double>priceMap=new LinkedHashMap<>();
        Map<String,Integer>quantityMap=new LinkedHashMap<>();
        while (!command.equals("buy")){//Beer 2.20 100
            String name=command.split(" ")[0];
            double price=Double.parseDouble(command.split(" ")[1]);
            int quantity=Integer.parseInt(command.split(" ")[2]);

//            if(!priceMap.containsKey(name)){
//                priceMap.put(name,price);
//            }else{
//                priceMap.put(name,priceMap.get(name)+price);
//            }
            priceMap.put(name,price);

            if(!quantityMap.containsKey(name)){
                quantityMap.put(name,quantity);
            }else {
                quantityMap.put(name, quantityMap.get(name) + quantity);
            }

            command=scanner.nextLine();
        }

//        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
//            System.out.println(entry.getKey()+" -> "+entry.getValue()*quantityMap.get(entry.getKey()));
//        }
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()*quantityMap.get(entry.getKey()));
        }


    }
}
