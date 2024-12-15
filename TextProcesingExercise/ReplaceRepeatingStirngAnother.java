package TextProcesingExercise;

import java.util.Scanner;

public class ReplaceRepeatingStirngAnother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();//aaaaabbbbbcdddeeeedssaa
        StringBuilder newText = new StringBuilder(text);//aaaaabbbbbcdddeeeedssaa

        for (int i = 0; i < newText.length() - 1; i++) {
            if (newText.charAt(i) == newText.charAt(i + 1)) {
                newText.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(newText);
    }
}