package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password=scanner.nextLine();

        String command=scanner.nextLine();
        while (!command.equals("Done")){
          String[]myCommand=command.split(" ");//TakeOdd
            String firstCommand=myCommand[0];

            switch (firstCommand){
                case "TakeOdd":
                    
                    break;
                case "Cut":
                    break;
                case "Substitute":
                    break;
            }





            command=scanner.nextLine();
        }
    }
}
