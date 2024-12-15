package RegularExpressionExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();
        Pattern pattern=Pattern.compile(">>(?<furniture>\\w+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");

        List<String>furnitreList=new ArrayList<>();
        double totalSum=0;

        while (!text.equals("Purchase")){
        Matcher matcher= pattern.matcher(text);

        if(matcher.find()){
            String furniture= matcher.group("furniture");
            Double price=Double.parseDouble(matcher.group("price"));
            int quantity=Integer.parseInt(matcher.group("quantity"));

            furnitreList.add(furniture);
            double currentSum=price*quantity;

            totalSum=totalSum+currentSum;
        }
            text=scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String element:furnitreList){
            System.out.println(element);
        }
        System.out.printf("Total money spend: %.2f",totalSum);

    }
}
