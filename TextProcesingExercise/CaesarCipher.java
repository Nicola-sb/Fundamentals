package TextProcesingExercise;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();
        //Programming is cool!
        StringBuilder cipher=new StringBuilder();
        //Surjudpplqj#lv#frro$
        for(int i=0 ;i<=text.length()-1 ;i++){
            char symbol=text.charAt(i);//P

            char encryptedSymbol=(char)(symbol+3);
            //По този начин взимам P и прибавям +3 и получвам S

            cipher.append(encryptedSymbol);
        }
        System.out.println(cipher);
    }
}
