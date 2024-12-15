package FinalExamRegular;

import java.util.Arrays;
import java.util.Scanner;

public class Registation02String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String command=scanner.nextLine();
        String substring="";
        while (!command.equals("Registration")){

          String[]inputArr=command.split(" ");
          String firstCommand=inputArr[0];

          if(firstCommand.equals("Letters")){
             String secondCommand=inputArr[1];
             if(secondCommand.equals("Lower")){
                 input=input.toLowerCase();
                 System.out.println(input);
             }else if(secondCommand.equals("Upper")){
                 input=input.toUpperCase();
                 System.out.println(input);
              }
          }else if(firstCommand.equals("Reverse")){//Reverse 1 3 //ThisIs --> TsIs
               int startIndex=Integer.parseInt(inputArr[1]);
               int endIndex=Integer.parseInt(inputArr[2]);

               String curentReverseInput=input;
               String reverseSubstring="";

               substring=curentReverseInput.substring(startIndex,endIndex);
               for(int i=substring.length()-1 ;i>=0 ;i--){
                   char currentString=substring.charAt(i);
                   reverseSubstring=reverseSubstring+currentString;
               }

               curentReverseInput.replace(substring,reverseSubstring);


//               if(startIndex>=0 && endIndex<= input.length-1){
//
//               }

          }else if(firstCommand.equals("Substring")){
              String currentSubsting=inputArr[1];
              if(input.contains(currentSubsting)){
                  input=input.replace(currentSubsting,"");
                  System.out.println(input);
              }else{
                  System.out.printf("The username %s doesn't contain %s.%n",input,currentSubsting);
              }
          }else if(firstCommand.equals("Replace")){
              String currentElement=inputArr[1];//n
              input=input.replaceAll(currentElement,"-");
              System.out.println(input);


          }else if(firstCommand.equals("IsValid")){
                String currentElement=inputArr[1];
                if(input.contains(currentElement)){
                    System.out.println("Valid username.");
                }else{
                    System.out.printf("%s must be contained in your username.%n",currentElement);
                }
          }
            command=scanner.nextLine();
        }
    }
}
