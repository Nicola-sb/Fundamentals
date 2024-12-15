package ExerciseMethods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String command=scanner.nextLine();
        while (!command.equals("END")){

            System.out.println(pandromInteger(command));
            command=scanner.nextLine();
        }

    }
    public static boolean pandromInteger(String number){
//        String reversedNumber=isReversed(number);
        if(number.equals(isReversed(number))){
            return true;
        }else{
            return false;
        }
    }
    public static String isReversed(String number){
        String reversed="";
        for(int i=number.length()-1 ;i>=0 ;i--){
            char currentSymbol=number.charAt(i);
            reversed=reversed+currentSymbol;
        }
        return reversed;
    }
}
