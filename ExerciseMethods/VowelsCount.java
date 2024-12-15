package ExerciseMethods;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine=scanner.nextLine().toLowerCase();
        printVowels(inputLine);
    }

    public static void printVowels(String input){
        int countVowels=0;
        for(int i=0 ;i<input.length() ;i++){
            char currentSymbol=input.charAt(i);
            if(currentSymbol == 'a'){
                countVowels++;
            }else if(currentSymbol=='u'){
                countVowels++;
            }else if(currentSymbol =='o'){
                countVowels++;
            }else if(currentSymbol== 'i'){
                countVowels++;
            }else if(currentSymbol =='y'){
                countVowels++;
            }else if(countVowels=='e'){
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}
