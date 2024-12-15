package FinalExamPreparation;

import java.util.Scanner;

public class ActovationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey=scanner.nextLine();
        //57 ot 100 tochki

        String command=scanner.nextLine();
        while (!command.equals("Generate")){
            String[]commandArray=command.split(">>>");
            String firstCommand=commandArray[0];

            if(command.contains("Contains")){
                String currentSubstring=commandArray[1];
                if(activationKey.contains(currentSubstring)){
                    System.out.printf("%s contains %s.%n",activationKey,currentSubstring);
                }else{
                    System.out.println("Substring not found!");
                }
            }else if(command.contains("Flip")){//Flip>>>Upper>>>3>>>14
                //Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                int firstIndex=Integer.parseInt(commandArray[2]);
                int endIndex=Integer.parseInt(commandArray[3]);
                String currentSubstringFlip=activationKey.substring(firstIndex,endIndex);
                if(command.contains("Upper")){
                 activationKey=activationKey.replace(currentSubstringFlip,currentSubstringFlip.toUpperCase());
                }else if(command.contains("Lower")){
                 activationKey=activationKey.replace(currentSubstringFlip,currentSubstringFlip.toLowerCase());
                }
                System.out.println(activationKey);
            }else if(command.contains("Slice")){
                //Slice>>>{startIndex}>>>{endIndex
                //Deletes the characters between the start and end indices (the end index is exclusive)
                 int startIndex=Integer.parseInt(commandArray[1]);
                 int endIndex=Integer.parseInt(commandArray[2]);
                 String currentSubstringSlice=activationKey.substring(startIndex,endIndex);
                 activationKey=activationKey.replace(currentSubstringSlice,"");

                System.out.println(activationKey);
            }
            command=scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s",activationKey);

    }
}
