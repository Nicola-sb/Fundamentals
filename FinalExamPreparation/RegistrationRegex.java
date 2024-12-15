package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        String regex="U\\$(?<username>[A-Z][a-z\\s]{2,})U\\$P@S(?<password>[a-z]{5,}[0-9\\s]+)P@S";
        Pattern pattern=Pattern.compile(regex);
        int countSuccessRef=0;
        for(int i=1 ;i<=n ;i++){
            String registration=scanner.nextLine();

            Matcher matcher= pattern.matcher(registration);

            if(matcher.find()){
                String currentUsername=matcher.group("username");
                String currentPassword=matcher.group("password");
                System.out.println("Registration was successfull");
                System.out.printf("Username: %s, Password: %s%n",currentUsername,currentPassword);
               countSuccessRef++;
            }else{
                System.out.println("Invalid username or password");
            }
        }

        System.out.printf("Successful registration: %d",countSuccessRef);

    }
}
//2
//U$TommyU$P@Sasdwe123P@S
//Sara 12343433
