package ExerciseMethods;

import java.util.Scanner;

public class CharachtesInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar=scanner.nextLine().charAt(0);
        char secondChar=scanner.nextLine().charAt(0);
        printTwoChars(firstChar,secondChar);
    }

    public static void printTwoChars(char first,char second){
        if(first<second){
            for(char symbol=(char)(first+1) ;symbol<second ;symbol++){
                System.out.print(symbol+ " ");
            }
        }else{
            for(char symbol=(char)(second+1) ;symbol<first ;symbol++){
                System.out.print(symbol+ " ");
            }
        }
    }
}
