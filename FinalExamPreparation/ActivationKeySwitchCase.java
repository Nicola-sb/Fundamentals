package FinalExamPreparation;

import TextProcesing.Substring;

import java.util.Scanner;

public class ActivationKeySwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey=scanner.nextLine();
//Compile time error...?
        String command=scanner.nextLine();
        while (!command.equals("Generate")){
         String[] tokens=command.split(">>>");
         String firstCommand=tokens[0];
         String substring="";

         int startIndex=0;
         int endIndex=0;

         switch (firstCommand){
             case "Contains"://Contains>>>{substring
                 substring=tokens[1];
                 if(activationKey.contains(substring)){
                     System.out.printf("%s contains %s%n.",activationKey,substring);
                 }else{
                     System.out.println("Substring not found!");
                 }
                 break;
             case "Flip"://Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                 String upperOrLower=tokens[1];
                 startIndex=Integer.parseInt(tokens[2]);
                 endIndex=Integer.parseInt(tokens[3]);
                 substring=activationKey.substring(startIndex,endIndex);
                 if(upperOrLower.equals("Upper")){
                     activationKey=activationKey.replace(substring,substring.toUpperCase());
                     System.out.println(activationKey);
                 }else if(upperOrLower.equals("Lower")){
                     activationKey=activationKey.replace(substring,substring.toLowerCase());
                     System.out.println(activationKey);
                 }
                 break;
             case "Slice"://Slice>>>{startIndex}>>>{endIndex}":
                 startIndex=Integer.parseInt(tokens[1]);
                 endIndex=Integer.parseInt(tokens[2]);
                 substring=activationKey.substring(startIndex,endIndex);
                 activationKey=activationKey.replace(substring,"");
                 System.out.println(activationKey);
                 break;
         }
            command=scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s",activationKey);
    }
}
