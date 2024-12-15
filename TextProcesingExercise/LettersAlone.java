package TextProcesingExercise;

import java.util.Scanner;

public class LettersAlone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();//A12b s17G
        String[] lettersArr = input.split("\\s+");//["A12b", "s17G"]

        double totalSum = 0;
        for (String code : lettersArr) {

            double number = getNumberSum(code);
            totalSum = totalSum + number;

        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getNumberSum(String code) {
        //If it's uppercase you divide the number by the letter's position in the alphabet.
        //If it's lowercase you multiply the number with the letter's position in the alphabet
        // A12b

        char firstLetter = code.charAt(0);// A
        char secondLetter = code.charAt(code.length() - 1);// b
        double numberMethod = Double.parseDouble(code.replace(firstLetter, ' ').replace(secondLetter, ' ').trim()); // 12

        if (Character.isUpperCase(firstLetter)) {
            int possitionUpper = (int) firstLetter - 64;
            numberMethod = numberMethod / possitionUpper;
        } else {
            int possitionLower = (int) firstLetter - 96;
            numberMethod = numberMethod * possitionLower;
        }

        if (Character.isUpperCase(secondLetter)) {
            int possitionUpper = (int) secondLetter - 64;
            numberMethod = numberMethod - possitionUpper;
        } else {
            int possitionLower = (int) secondLetter - 96;
            numberMethod = numberMethod + possitionLower;
        }
        return numberMethod;
    }
}
