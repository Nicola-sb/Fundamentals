package AssociativeArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class CountsCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText=scanner.nextLine();
        Map<Character,Integer>printCount=new LinkedHashMap<>();

        for (char symbol : inputText.toCharArray()){
            Integer value=printCount.get(symbol);
            if(symbol ==' '){
                continue;
            }

            if(printCount.containsKey(symbol)){
                printCount.put(symbol,value+1);
            }else{
                printCount.put(symbol,1);
            }
        }

//        for (Map.Entry<Character, Integer> entry : printCount.entrySet()) {
//            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());
//        }
//        printCount.entrySet().forEach(entry -> System.out.println(entry.getKey()+ " -> "+ entry.getValue()));
        printCount.forEach((key,value)->System.out.println(key+" -> "+ value));

    }
}
