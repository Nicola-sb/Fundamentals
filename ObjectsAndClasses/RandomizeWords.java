package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> printWords=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!printWords.isEmpty()){
            Random rnd=new Random();
            int randomIndex=rnd.nextInt(printWords.size());

            String words=printWords.get(randomIndex);
            System.out.println(words);
            printWords.remove(randomIndex);
        }
    }
}
