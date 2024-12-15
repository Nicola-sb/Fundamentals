package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password=scanner.nextLine();
        boolean isBetween6and10=isBetweenSixAndTen(password);
        if(!isBetween6and10){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isDigit=isDigitOrLetter(password);
        if(!isDigit){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isTwoDigit=haveAtLeast2Digits(password);
        if(!isTwoDigit){
            System.out.println("Password must have at least 2 digits");
        }

        if(isBetween6and10 && isDigit && isTwoDigit){
            System.out.println("Password is valid");
        }


  }
     public static boolean isBetweenSixAndTen(String password){
        if(password.length() >=6 && password.length() <=10){
            return true;
        }else{
            return false;
        }
  }
  public static boolean isDigitOrLetter(String password){
        for(int i=0 ;i<password.length() ;i++){
            char curretnSymbol=password.charAt(i);
            if(!Character.isLetterOrDigit(curretnSymbol)){
                return false;
            }
        }
        return true;
  }
  public static boolean haveAtLeast2Digits(String password){
        int count=0;
        for(int i=0 ;i<password.length() ;i++){
            char currrentSymbol=password.charAt(i);
            if(Character.isDigit(currrentSymbol)){
                count++;
            }
        }
        if(count >=2){
            return true;
        }else{
            return false;
        }
  }

}
