package TextProcesing;

import java.util.Scanner;

public class SubstringWithContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove=scanner.nextLine();
        String text=scanner.nextLine();

        while (text.contains(toRemove)){
            text=text.replace(toRemove,"");
        }
        System.out.println(text);
    }
}
