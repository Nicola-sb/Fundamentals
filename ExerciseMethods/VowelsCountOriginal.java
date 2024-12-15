package ExerciseMethods;

import java.util.Scanner;

public class VowelsCountOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine().toLowerCase();
        printVowels(input);

    }
    public static void printVowels(String input){
         int countVowels=0;
        for(int i=0 ;i<input.length() ;i++){
            char currentSymbol=input.charAt(i);
            switch (currentSymbol){
                case 'a':
                case 'u':
                case 'e':
                case 'o':
                case 'y':
                case 'i':
                    countVowels++;
                    break;
            }
        }
        System.out.println(countVowels);
    }
}
