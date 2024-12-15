package BasicsExercise;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       String username=scanner.nextLine();
       StringBuilder passwordBuilder=new StringBuilder();

       for(int i=username.length()-1;i>=0 ;i--){
           char currentSymbol=username.charAt(i);

           passwordBuilder.append(currentSymbol);
       }
        String password=passwordBuilder.toString();

       int countPassword=0;
       String command=scanner.nextLine();
       while (!command.equals(password)){
           countPassword++;
           if(countPassword==4){
               System.out.printf("User %s blocked!",username);
               break;
           }
           System.out.println("Incorrect password. Try again.");

           command=scanner.nextLine();
       }

       if(command.equals(password)){
           System.out.printf("User %s logged in.",username);
       }
    }
}
