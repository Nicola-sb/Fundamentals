package AssociativeArrays;

import java.util.*;

public class OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]wordsOdd=scanner.nextLine().split(" ");
        //Java C# PHP PHP JAVA C java
        Map<String,Integer>printMap=new LinkedHashMap<>();
        for(int i=0 ;i< wordsOdd.length ;i++){
            String currentWord=wordsOdd[i].toLowerCase();
            Integer value=printMap.get(currentWord);
            if(printMap.containsKey(currentWord)){
                printMap.put(currentWord,value + 1);
            }else{
                printMap.put(currentWord,1);
            }
        }

        List<String>listOdd=new ArrayList<>();
        for (Map.Entry<String, Integer> entry : printMap.entrySet()) {
            if(entry.getValue() % 2 ==1){
                listOdd.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ",listOdd));

    }
}
