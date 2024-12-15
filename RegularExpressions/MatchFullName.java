package RegularExpressions;

import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        Pattern pattern=Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");

        Matcher matcher= pattern.matcher(input);
        //Matcher matcher= pattern.matcher(input);-това означвам искам този патерн(който съм си създал -->\\b[A-Z][a-z]+ [A-Z][a-z]+\\b"
        //да ми търси съвпадения(.matcher) в текста,който съм си въвел(input)

//        while (matcher.find()){
//            System.out.print(matcher.group() + " ");
//        }
        while (matcher.find()){
            String nameFound= matcher.group();
            System.out.print(nameFound+ " ");
        }
        //matcher.find търся съвпадения в текста
    }
}
