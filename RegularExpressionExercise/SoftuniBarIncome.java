package RegularExpressionExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex="%(?<username>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern=Pattern.compile(regex);
        double totalIncome=0;

        String text=scanner.nextLine();
        while (!text.equals("end of shift")){
            Matcher matcher= pattern.matcher(text);
          if(matcher.find()){
              String name=matcher.group("username");
              String product=matcher.group("product");
              int count=Integer.parseInt(matcher.group("count"));
              double price=Double.parseDouble(matcher.group("price"));

              double totalPrice=count*price;
              totalIncome=totalIncome+totalPrice;
              System.out.printf("%s: %s - %.2f%n",name,product,totalPrice);
          }
            text=scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
//Какво научих от задачата?
//Разписването на регекса
// word character == \w+ това включва [A-Za-z][0-9]_
// * звездичката означва,че може да го има 0 пъти или много
