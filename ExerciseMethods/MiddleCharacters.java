package ExerciseMethods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        printMiddleCharacters(input);

    }
    public static void printMiddleCharacters(String input){
        if(input.length()%2!=0){
            int middleCharaters=input.length() / 2;
            System.out.println(input.charAt(middleCharaters));
        }else{
            int firstMiddle=input.length()/2-1;
            int secondMiddle=input.length() /2;
            System.out.printf("%c%c",input.charAt(firstMiddle),input.charAt(secondMiddle));
        }
    }
}
