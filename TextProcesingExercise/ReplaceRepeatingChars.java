package TextProcesingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();
        //aaaaabbbbbcdddeeeedssaa  -->> abcdedsa
        StringBuilder newText=new StringBuilder();

        char firstSymbol=text.charAt(0);
        //първият символ винаги си до добавям,защото няма как да ми се повтаря.Заради това го изваждам в отделна променлива и го добавям към SB
        newText.append(firstSymbol);
        //добавил съм си буквата "а"  и за сега newText ми съдържа -->> а

        //Обхождам си всичките символи след 0,защото 0 ми е буквата "а"
        for(int i=1 ;i<text.length() ;i++){
            char currentSymbol=text.charAt(i);//взимам си текущия симовл
            char lastAddedSymbol= newText.charAt(newText.length()-1);
            //по този начин си взимам последната добавена буква в newText и проверявам дали ми е различна от currentSymbol
            //ако е различна от currentSymbol си я добавям към newText
            if(currentSymbol!=lastAddedSymbol){
                newText.append(currentSymbol);
            }
        }
        System.out.println(newText);
    }
}
