package TextProcesingExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //НЕ Е РЕШЕНА!!!
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputWord = scanner.nextLine().split(" ");

            for (String word : inputWord) {
                String myWord="";
                if (word.contains("@")) {
                    char firstLetter=word.charAt(0);
                    char secondLetter=word.charAt(word.length()-1);
                    String newWord=word.replace(firstLetter,' ').replace(secondLetter, ' ').trim();
                    System.out.println(newWord);
                }
                if(word.contains("#")){
                    char firstLetter=word.charAt(0);
                    char secondLetter=word.charAt(word.length()-1);
                    String age=word.replace(firstLetter,' ').replace(secondLetter, ' ').trim();
                    System.out.println(age);
                }



            }
        }
    }
}