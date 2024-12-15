package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //10 -5 7 9 -33 50
        //Трябва да обходя през всичките числа и да проверя дали са положителни
        //Отрицателните трябва да ги премахна от Листа
        //Трябва да принтирам останлият лист в обратен ред

        for(int i=0 ;i<listNumbers.size() ;i++){
              int currentNumber=listNumbers.get(i);
              if(currentNumber<0){
                  listNumbers.remove(i);
                  i=-1;
              }
        }

//        listNumbers.removeIf(e-> e<0);

        if(listNumbers.isEmpty()){
            System.out.println("empty");
        }else{
            Collections.reverse(listNumbers);
            for (int element:listNumbers){
                System.out.print(element + " ");
            }
//            System.out.println(listNumbers.toString().replaceAll("[\\[\\],]", ""));
        }


    }
}
