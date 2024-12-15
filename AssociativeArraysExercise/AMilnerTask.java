package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMilnerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        Map<String,Integer> printMap=new LinkedHashMap<>();
        while (!input.equals("stop")){
           int quantity=Integer.parseInt(scanner.nextLine());



           if(!printMap.containsKey(input)){
               printMap.put(input,quantity);
           }else{
             printMap.put(input,printMap.get(input)+quantity);
           }
            input=scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : printMap.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
