package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText=scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());

        String result=printText(inputText,n);
        System.out.println(result);
//        System.out.println(printText(inputText,n));


    }

    public static String printText(String textToRepeat,int n){
        String result="";
        for(int i=1 ;i<=n ;i++){
            result=result+textToRepeat;
        }
        return result;
    }
}
