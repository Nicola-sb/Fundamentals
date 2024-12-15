package MidExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList=Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command=scanner.nextLine();
        while (!command.equals("Shop!")){
            String[]possibleCommand=command.split("%");
            String firstCommand=possibleCommand[0];

            switch (firstCommand){
                case "Important":
                    String elementProduct=possibleCommand[1];
                    if(productList.contains(elementProduct)){
                        productList.remove(elementProduct);
                        productList.set(0,elementProduct);
                    }else{
                        productList.add(0,elementProduct);
                    }

                    break;
                case "Add":
                    String product=possibleCommand[1];
                    if(!productList.contains(product)){
                        productList.add(product);
                    }else{
                        System.out.println("The product is already in the list.");
                    }
                    break;
                case "Swap":
                    String firstProduct=possibleCommand[1];//salt
                    String secondProduct=possibleCommand[2];//bananas
                    //ако и двата продукта съществувам ги разменям.Ако единят го няма принтирам съобщение
                    //Трябва да проверя дали ги имам в листа
                    if(productList.contains(firstProduct) && productList.contains(secondProduct)){
                        productList.remove(firstProduct);
                    }

                    break;
                case "Remove":
                    String productToRemove=possibleCommand[1];
                    if(productList.contains(productToRemove)){
                        productList.remove(productToRemove);
                    }else{
                        System.out.printf("Product %s isn't in the list.",productToRemove);;
                    }
                    break;
                case "Reversed":
                    Collections.reverse(productList);
                    break;
            }

            command=scanner.nextLine();
        }

        Collections.sort(productList);
        for(int i=0 ;i<productList.size()-1 ;i++){
            System.out.printf("%d. %s%n",i+1,productList.get(i));
        }

    }
}
