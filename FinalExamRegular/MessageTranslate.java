package FinalExamRegular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String regex="!(?<command>[A-Z][a-z]{3,})!:\\[(?<myCommand>[A-Za-z]{8,})";
        Pattern pattern=Pattern.compile(regex);


        for(int i=1 ;i<=n ;i++){
            String text=scanner.nextLine();
            Matcher matcher= pattern.matcher(text);//!Send!:[IvanisHere]

            if(matcher.find()){
                String command= matcher.group("command");
             String stringToPrint= matcher.group("myCommand");
             StringBuilder sb=new StringBuilder();
             for(int j=0 ;j<stringToPrint.length() ;j++){
                 char symbol=stringToPrint.charAt(j);
                 sb.append((int)symbol+ " ");
             }
                System.out.printf("%s: %s%n",command,sb.toString());

            }else{
                System.out.println("The message is invalid");
            }
        }

    }
}
