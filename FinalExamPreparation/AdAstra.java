package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();
        //#Bread#19/03/21#4000#|Invalid|03/03.20||Apples|08/10/20|200||Carrots|06/08/20|500||Not right|6.8.20|5|

        String regex="([#|])(?<product>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern=Pattern.compile(regex);

        int totalCalories=0;
        Matcher matcher= pattern.matcher(text);
        StringBuilder pechat=new StringBuilder();

        while (matcher.find()){
            String productName= matcher.group("product");
            String expirationDate=matcher.group("expirationDate");
            int calories=Integer.parseInt(matcher.group("calories"));

            totalCalories=totalCalories+calories;
            pechat.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n",productName,expirationDate,calories));
        }
        int foodPerdDay=totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n",foodPerdDay);
        System.out.println(pechat);
    }
}
//Какво научих?
//При регекса ако трябва да имам спейс(празно място) мога да сложа \s
//Мога да си създам StringBuilder в който да си пазя информация като я сложа в String.format и накрая си я принтирам
