package TextProcesingExercise;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Входни данни
        String input=scanner.nextLine();
        //sh, too_long_username, !lleg@l ch@rs, jeffbutt
        String[]usernames=input.split(", ");
        //[sh, too_long_username, !lleg@l ch@rs, jeffbutt]

        //2.Проверка за username
        //2.1 Правя си foreach цикъл и искам да обходя всеки един username в масива usernameS
        for (String username:usernames){
            if(isValidWord(username)){
                System.out.println(username);
            }
        }
    }
    //Метод,който проверява дали даден username e валиден
    //връща ни true или false за това го правим boolean
    public static boolean isValidWord(String usernameValid){
        //1.Has a length between 3 and 16 characters.
        if(usernameValid.length()<3 || usernameValid.length()>16){
            return false;
        }
        // Contains only letters, numbers, hyphens, and underscores.
        //2.Трябва да си обходя всеки един символ от username--> ползвам foreach
        //Трябва въпросният username да го направя в масив от симовили за да мога да го обходя--> за целта след usernameValid слагам toArray
        //Трябва моя Username да го превърна в масив от символи!
        for (char symbol:usernameValid.toCharArray()){
            if(!Character.isLetterOrDigit(symbol) && symbol!='-' && symbol!='_'){
              return false;
            }
        }
        return true;
    }
}
