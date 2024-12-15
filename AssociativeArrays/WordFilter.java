package AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]word= Arrays.stream(scanner.nextLine().split(" ")).filter(e->e.length() % 2==0).toArray(String[]::new);

//        for (String element:word){
//            System.out.println(element);
        System.out.println(String.join(System.lineSeparator(),word));
//        String[] words=scanner.nextLine().split(" ");
//        List<String> printWords=new ArrayList<>();
//        for(int i=0 ;i< words.length ;i++){
//            int currentWord=words[i].length();
//            if(currentWord % 2==0){
//                printWords.add(words[i]);
//            }
//        }
//        System.out.println(String.join(System.lineSeparator(),printWords));

        }
    }

