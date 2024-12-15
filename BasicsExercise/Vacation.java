package BasicsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople=Integer.parseInt(scanner.nextLine());
        String typeOftheGroup=scanner.nextLine();
        String dayOfWeek=scanner.nextLine();

        double priceForOneNight=0;

        switch (typeOftheGroup){
            case "Students":
                if(dayOfWeek.equals("Friday")){
                    priceForOneNight=8.45;
                }else if(dayOfWeek.equals("Saturday")){
                    priceForOneNight=9.80;
                }else if(dayOfWeek.equals("Sunday")){
                    priceForOneNight=10.46;
                }

                break;
            case "Business":
                if(dayOfWeek.equals("Friday")){
                priceForOneNight=10.90;
            }else if(dayOfWeek.equals("Saturday")){
                priceForOneNight=15.60;
            }else if(dayOfWeek.equals("Sunday")){
                priceForOneNight=16;
            }
                break;
            case "Regular":
                if(dayOfWeek.equals("Friday")){
                priceForOneNight=15;
            }else if(dayOfWeek.equals("Saturday")){
                priceForOneNight=20;
            }else if(dayOfWeek.equals("Sunday")){
                priceForOneNight=22.50;
            }
                break;
        }

        double allPrice=groupOfPeople * priceForOneNight;

        if(typeOftheGroup.equals("Students") && groupOfPeople >=30){
            allPrice=allPrice * 0.85;
        }

        if(typeOftheGroup.equals("Business") && groupOfPeople >=100){
            allPrice=allPrice - (10 * priceForOneNight);
        }

        if(typeOftheGroup.equals("Regular") && groupOfPeople>=10 && groupOfPeople <=20){
            allPrice=allPrice * 0.95;
        }



        System.out.printf("Total price: %.2f",allPrice);


    }
}
