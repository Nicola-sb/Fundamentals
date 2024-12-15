package Methods;

import java.util.Scanner;

public class GreatherOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String input=scanner.nextLine();

         switch (input){
             case "int":
                 int number1=Integer.parseInt(scanner.nextLine());
                 int number2=Integer.parseInt(scanner.nextLine());
                 System.out.println(printInt(number1,number2));
                 break;
             case "char":
                 char charNumber1=scanner.nextLine().charAt(0);
                 char charNumber2=scanner.nextLine().charAt(0);
                 System.out.println(printChar(charNumber1,charNumber2));
                 break;
             case "string":
                 String firstString=scanner.nextLine();
                 String secondString=scanner.nextLine();
                 System.out.println(printString(firstString,secondString));
                 break;
         }
    }
    public static int printInt(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static char printChar(char number1,char number2){
        if(number1>number2){
            return number1;
        }else{
            return number2;
        }
    }
    public static String printString(String firstString,String secondString){
        String result="";
        if(firstString.compareTo(secondString)>0){
            return firstString;
        }else{
            return secondString;
        }
    }
}
