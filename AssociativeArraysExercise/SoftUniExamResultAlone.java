package AssociativeArraysExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResultAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String,Integer> pointsMap=new LinkedHashMap<>();
        Map<String,Integer> countLanguage=new LinkedHashMap<>();
        while (!command.equals("exam finished")){
           String[]inputLine=command.split("-");
           String username=inputLine[0];
           if(inputLine.length==3){//Peter-Java-84
               String language=inputLine[1];
               int points=Integer.parseInt(inputLine[2]);//84,70
               if(!pointsMap.containsKey(username)){
                   pointsMap.put(username,points);
               }else{
                   int currentPoint=pointsMap.get(username);//84
                   if(points>currentPoint){
                       pointsMap.put(username,points);
                   }
               }

               if(!countLanguage.containsKey(language)){
                   countLanguage.put(language,1);
               }else{
                   countLanguage.put(language,countLanguage.get(language)+1);
               }

           }else{
               pointsMap.remove(username);
           }
            command=scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : pointsMap.entrySet()) {
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : countLanguage.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }


    }
}
