package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Map<chr,int>
        //2.обхождаме текста
        //3.взимаме всяка една буква

        //1.Проверяваме дали е " "-->ако е спейс продължаваме
        //2.Проверка има ли я в мапа.Ако я няма добавяме я;Ако я има увеличавам с 1

        String input=scanner.nextLine();
        Map<Character,Integer> countSymbol=new LinkedHashMap<>();

        //text text text

        for(int i=0;i<input.length() ;i++){
            char currentSymbol=input.charAt(i);
            if(currentSymbol==' '){
                continue;
            }
//            int value=countSymbol.get(i);
            if(countSymbol.containsKey(currentSymbol)){
                countSymbol.put(currentSymbol,countSymbol.get(currentSymbol) + 1);
            }else{
                countSymbol.put(currentSymbol,1);
            }
        }
//        for (Map.Entry<Character, Integer> entry : countSymbol.entrySet()) {
//            System.out.println(entry.getKey() + " -> "+ entry.getValue());
//        }
        countSymbol.forEach((keyEntry,valueEntry)-> System.out.println(keyEntry+ " -> "+valueEntry));

    }
}
