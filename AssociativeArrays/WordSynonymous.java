package AssociativeArrays;

import java.util.*;

public class WordSynonymous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> printMap=new LinkedHashMap<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0 ;i<n ;i++){
            String word=scanner.nextLine();//word
            String synonym=scanner.nextLine();//adorable
            //Когато прочета думата и синонима трябв да ги запазя някъде -->Мап
            //В Мапа ключа ми е Стринг(word),a за стойност ще си направя Лист от Стрингове(за да мога да съхранявам повече от един синоним)

            if(!printMap.containsKey(word)){
                //Ако ключа(word->cute) го няма в Мапа го добави в списъка на този ключ стойнсостта(adorable)
                //Ako в containsKey нямаме тази дума,то трябв да я добавяме
               printMap.put(word,new ArrayList<>());
               //За да го създам в паметта този Лист трябва да го създам
                //така си добавям ключа(word) и след това за да добавя към този спъсък на мапа трябва да си добавя синонима-->
                //а за да го добавя синонима трябва да имам създаен списъл(new ArrayList);
                //не мога директно да кажа (word).add(synonym),защото той не съществува в паметта(не е създаден)
               printMap.get(word).add(synonym);
               //след като е създател листа мога да му задам стойност(синоним)
            }else{
                printMap.get(word).add(synonym);
                //За да добавим към Листа ние трябва да го досъпим този Лист
                //достъпваме ме го така както си достъпваме value на конкретен ключ
            }
        }
        for (Map.Entry<String, List<String>> entry : printMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}
