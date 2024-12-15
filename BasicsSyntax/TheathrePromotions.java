package BasicsSyntax;

import java.util.Scanner;

public class TheathrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());

        int ticketPrise=0;

        switch (typeOfDay){
            case "Weekday":
                if(age >=0 && age <=18){
                    ticketPrise=12;
                }else if(age >18 && age <=64){
                    ticketPrise=18;
                }else if(age > 64 && age <=122){
                    ticketPrise=12;
                }
                break;
            case "Weekend":
                if(age >=0 && age <=18){
                    ticketPrise=15;
                }else if(age >18 && age <=64){
                    ticketPrise=20;
                }else if(age > 64 && age <=122){
                    ticketPrise=15;
                }
                break;
            case "Holiday":
                if(age >=0 && age <=18){
                    ticketPrise=5;
                }else if(age >18 && age <=64){
                    ticketPrise=12;
                }else if(age > 64 && age <=122){
                    ticketPrise=10;
                }
                break;
        }
        if(age >=0 && age <=122){
            System.out.printf("%d$",ticketPrise);
        }else{
            System.out.println("Error!");
        }
    }
}
