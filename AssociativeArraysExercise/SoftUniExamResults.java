package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        //Трябва да си създам два мапа.В единия ще съхранявам username,point,а в другия language,count

        Map<String,Integer>mapPointsUser=new LinkedHashMap<>();
        //user,points
        Map<String,Integer>mapUserNameLanguage=new LinkedHashMap<>();
        //language,count

        while (!command.equals("exam finished")){
           String[]inputLine=command.split("-");
           String username=inputLine[0];

           if(inputLine.length==3){
               String language=inputLine[1];
               int points=Integer.parseInt(inputLine[2]);

               if(!mapPointsUser.containsKey(username)){
                   mapPointsUser.put(username,points);
               }else{
                   int currentPoints=mapPointsUser.get(username);
                   if(points>currentPoints){
                       mapPointsUser.put(username,points);
                   }
               }

               if(!mapUserNameLanguage.containsKey(language)){
                   mapUserNameLanguage.put(language,1);
               }else{
                   mapUserNameLanguage.put(language,mapUserNameLanguage.get(language)+1);
               }
           }else {
               mapPointsUser.remove(username);
           }

            command=scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : mapPointsUser.entrySet()) {
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : mapUserNameLanguage.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }


    }
}
