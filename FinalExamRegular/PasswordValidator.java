package FinalExamRegular;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password=scanner.nextLine();//invalidpaswword*

        while (!password.equals("Complete")){
           String []commands=password.split(" ");
           String firstCommand=commands[0];

           if(firstCommand.equals("Make Upper")){

           }else if(firstCommand.equals("Make Lower")){

           }else if(firstCommand.equals("Insert"))

               
            password=scanner.nextLine();
        }
    }


//    }public static boolean isValisPassword(String password){
//
//        if(password.length()>=8){
//
//        }
}
