package FinalExamRegular;

import java.util.*;

public class MonthlyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command=scanner.nextLine();
        Map<String, Double> deliverMap=new LinkedHashMap<>();
        Map<String,Double>sellMap=new LinkedHashMap<>();
        while (!command.equals("End")){
            String[]inputLine=command.split(" ");//Deliver Micro 10000.00
            String firstCommand=inputLine[0];

            String distributorNameDeliver=inputLine[1];

            double moneySpentDeliver=Double.parseDouble(inputLine[2]);
            if(firstCommand.equals("Deliver")){

              if(!deliverMap.containsKey(distributorNameDeliver)){
//                  deliverMap.put(distributorNameDeliver,new ArrayList<>());
                  deliverMap.put(distributorNameDeliver,moneySpentDeliver);

              }else{
                  deliverMap.put(distributorNameDeliver,moneySpentDeliver);
              }
            }else if(firstCommand.equals("Return")){
//              String distributorNameReturn=inputLine[1];
              double moneyReturned=Double.parseDouble(inputLine[2]);
              if(deliverMap.containsKey(distributorNameDeliver)){
                  if(deliverMap.get(distributorNameDeliver)<=0){
                      deliverMap.remove(distributorNameDeliver);
                  }else{
                      deliverMap.put(distributorNameDeliver,moneySpentDeliver-moneyReturned);
                  }

              }
            }else if(firstCommand.equals("Sell")){
                String clientName=inputLine[1];
                double moneyEarnded=Double.parseDouble(inputLine[2]);

                if(!sellMap.containsKey(clientName)){
                    sellMap.put(clientName,moneyEarnded);
                }else{
                    double currentMoneyEarnded=sellMap.get(clientName);

                }



            }

            command=scanner.nextLine();
        }
    }
}
