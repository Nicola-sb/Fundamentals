package TextProcesing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []bannedWords=scanner.nextLine().split(", ");//Linux, Windows
        String text=scanner.nextLine();

        for (String bannWord:bannedWords){
            if(text.contains(bannWord)){
                text=text.replace(bannWord,getString("*", bannWord.length()));
            }
        }
        System.out.println(text);
    }

    public static String getString(String someWord,int counter){
        String result="";
        for(int i=0 ;i<counter ;i++){
            result=result+someWord;
        }
        return result;
    }
}
