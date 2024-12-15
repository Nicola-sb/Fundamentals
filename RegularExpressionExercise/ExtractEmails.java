package RegularExpressionExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        List<String> valiEmail=new ArrayList<>();

        Pattern pattern=Pattern.compile("\\w*[-._]?\\w+@\\w+[-]?\\w+.\\w+.\\w+");
        Matcher matcher= pattern.matcher(input);

        while (matcher.find()){
            String mail= matcher.group();
            valiEmail.add(mail);
        }
        for (String element:valiEmail){
            System.out.println(element);
        }
    }
}
