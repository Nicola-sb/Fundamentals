package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,String>parkingTask=new LinkedHashMap<>();
        for(int i=1 ;i<=n ;i++){
            String[]inputLine=scanner.nextLine().split(" ");//register John CS1234JS

            if(inputLine.length==3){
                String username=inputLine[1];
                String licenseNumber=inputLine[2];
                if(!parkingTask.containsKey(username)){
                    parkingTask.put(username,licenseNumber);
                    System.out.println(username+" registered "+licenseNumber+" successfully");
                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n",licenseNumber);
                }


            }else{
                String username=inputLine[1];
                if(parkingTask.containsKey(username)){
                    parkingTask.remove(username);
                    System.out.println(username+" unregistered successfully");
                }else{
                    System.out.printf("ERROR: user %s not found%n",username);
                }
            }
        }
        for (Map.Entry<String, String> entry : parkingTask.entrySet()) {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

    }
}
