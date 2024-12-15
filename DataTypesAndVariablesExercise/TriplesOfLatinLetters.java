package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// не е решенаа
        int number=Integer.parseInt(scanner.nextLine());

        for(char i='a';i<'a'+number ;i++){
            for(char j='a';j<'a'+number ;j++){
                for(char k='a';k<'a'+number ;k++){

                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }


    }
}