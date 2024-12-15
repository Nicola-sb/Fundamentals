package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String regex="@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=null;

        for(int i=1 ;i<=n ;i++){
            String barcode=scanner.nextLine();//@#FreshFisH@#

            matcher= pattern.matcher(barcode);
            if(matcher.find()){//FreshFish...Che4se2asdas
                StringBuilder sb=new StringBuilder();
                for(int j=0 ;j<barcode.length() ;j++){
                  char symbol=barcode.charAt(j);
                  //The product group is obtained by concatenating all the digits found in the barcode.
                  // If there are no digits present in the barcode, the default product group is "00".
                  if(Character.isDigit(symbol)){
                      sb.append(symbol);
                  }
              }
                if(sb.length()==0){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s%n",sb.toString());
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
//Какво научих?
//Когато трябв да търся числа в дадек текст мога да си създам StringBuilder след което с фор цикъл да си обходя текста и
// да си създам променлива char symbol=barcode.charAt(j) след което да попитам с Charachted is Digit дали е число и яко е число
// да си го добавя към StringBuildera --> по този начинн си запазвам всички числа в StringBuildera

//Ако нямам числа в текстра трябва да изпринтирам 00 --> проверя както попитам колко е дължината на sb и ако е 0 си принтирам 00
