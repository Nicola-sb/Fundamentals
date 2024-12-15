package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();

        String regex="([:]{2}|[*]{2})(?<emojiGroup>[A-Z][a-z]{2,})\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        int coolTreshold=1;
//. It is obtained by multiplying all the digits found in the input
        for (char symbol:text.toCharArray()){
            if(Character.isDigit(symbol)){
                coolTreshold=coolTreshold*Integer.parseInt(symbol+"");
            }
        }
        System.out.printf("Cool threshold: %d%n",coolTreshold);

        int allEmoji=0;
        List<String>coolEmoji=new ArrayList<>();

        while (matcher.find()){
            allEmoji++;
            String currentEmoji= matcher.group("emojiGroup");//::Joy:: - 306

            int currentEmojiPoint=0;
//            for(int i=0 ;i<currentEmoji.length() ;i++){
//                char symbol=currentEmoji.charAt(i);
//                currentEmojiPoint=currentEmojiPoint+(int)symbol;
//            }
            for (char symbol:currentEmoji.toCharArray()){
                currentEmojiPoint=currentEmojiPoint+(int)symbol;
            }
            if(currentEmojiPoint>=coolTreshold){
                coolEmoji.add(matcher.group());
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n",allEmoji);
        coolEmoji.forEach(emoji -> System.out.println(emoji));
    }
}
//Какво научих?  За да преобразувам чар на инт --> първо трябва да преобразувам чара в стринг и след това в инт -->
// coolTreshold=coolTreshold*Integer.parseInt(symbol+"");

// В сайта рекс101 оператора или е |   --> По условие имам,че мога да срещам : или * изпозлвам | -->
//Като ги слагам отделно ( [:]{2} | [*]{2} )
