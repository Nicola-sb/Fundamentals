package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  //      String number=scanner.nextLine();
        List<String>numbers= Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        //["1 2 3", "4 5 6" ,"  7  8"]
        Collections.reverse(numbers);

        System.out.print(numbers.toString()
                .replace("[","")
                .replace("]","")
                .replace(",","").
                 replaceAll("\\s+"," "));



    }
}
