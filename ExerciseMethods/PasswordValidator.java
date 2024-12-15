package ExerciseMethods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPassword=scanner.nextLine();
        boolean isValidLengt1=isValidLenght(inputPassword);
        if(!isValidLengt1){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isLetterOrDigit1=isLetterOrDigit(inputPassword);
        if(!isLetterOrDigit1){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isDigit1=isDigit2(inputPassword);
        if(!isDigit1){
            System.out.println("Password must have at least 2 digits");
        }

        if(isValidLengt1 && isLetterOrDigit1 && isDigit1){
            System.out.println("Password is valid");
        }


    }
    public static boolean isValidLenght(String password){
        if(password.length() >=6 && password.length()<=10){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isLetterOrDigit(String password){
        for(int i=0 ;i<password.length() ;i++){
            char currentDigit=password.charAt(i);
            if(!Character.isLetterOrDigit(currentDigit)){
                return false;
            }
        }
        return true;
    }

    public static boolean isDigit2(String password){
        int countDigit=0;
        for(int i=0 ;i<password.length() ;i++){
            char currentDigi=password.charAt(i);
            if(Character.isDigit(currentDigi)){
                countDigit++;
            }
        }
        if(countDigit>=2){
            return true;
        }else{
            return false;
        }
    }


}
