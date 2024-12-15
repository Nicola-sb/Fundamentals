package TextProcesingExercise;

import java.util.Scanner;

public class StringProcesingAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       НЕ Е РЕШЕНА!!!
        int n=Integer.parseInt(scanner.nextLine());

        for(int i=0 ;i<n ;i++){
            String[]inputArr=scanner.nextLine().split(" ");

            for (String word:inputArr){
                if(word.contains("@")){
                    String name=getName(word);//George
                }
                if(word.contains("#")){
                    String age=getAge(word);//18
                    System.out.println(getName(word) + "is");
                }
            }
        }
    }

    private static String getAge(String word) {
        char firstLetter=word.charAt(0);
        char secondLetter=word.charAt(word.length()-1);
        String age=(word.replace(firstLetter,' ').replace(secondLetter,' ').trim());
        return age;
    }

    private static String getName(String word) {
        char firstLetter=word.charAt(0);
        char secondLetter=word.charAt(word.length()-1);
        String newWord=word.replace(firstLetter,' ').replace(secondLetter, ' ').trim();
        return newWord;
    }
}
