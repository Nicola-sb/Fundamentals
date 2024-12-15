package MidExamPreparation;

import java.util.Scanner;

public class GoogleSearches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double googleIncomeOneSignleUser=Double.parseDouble(scanner.nextLine());
        int numberUsers=Integer.parseInt(scanner.nextLine());

        double totalMoney=0;
        double allMoney=0;
        for(int i=1 ;i<=numberUsers ;i++){
            int numberOfSeachs=Integer.parseInt(scanner.nextLine());

            if(numberOfSeachs==1){
                continue;
            }

            if(numberOfSeachs > 5){
                totalMoney=(numberOfSeachs * googleIncomeOneSignleUser) * 2;
                allMoney=allMoney+totalMoney;
//                googleIncomeOneSignleUser=googleIncomeOneSignleUser* numberOfSeachs;
//                googleIncomeOneSignleUser = googleIncomeOneSignleUser * 2;
            }

            if(i % 3 ==0){
                totalMoney=(numberOfSeachs * googleIncomeOneSignleUser) * 3;
                allMoney=allMoney+totalMoney;
               if(numberOfSeachs==1){
                   continue;
               }

            }



        }
        System.out.printf("Total money earned: %.2f",allMoney);
    }
}
