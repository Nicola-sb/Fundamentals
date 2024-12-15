package RegularExpressions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText=scanner.nextLine();

        Pattern pattern=Pattern.compile("\\+359([ -])[2](?:\\1)\\d{3}\\1\\d{4}\\b");
        Matcher matcher= pattern.matcher(inputText);

        List<String>phoneNumberList=new LinkedList<>();

        while (matcher.find()){
            String phoneNumber= matcher.group();
            phoneNumberList.add(phoneNumber);
        }

        System.out.println(String.join(", ",phoneNumberList));
    }
}
