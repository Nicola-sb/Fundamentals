package DataTypeAndVariables;

import java.util.Scanner;

public class ReversedChaWithString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //80 ot 100

        String data="";


        for(int i=1;i<=3 ;i++){
            char symbol=scanner.nextLine().charAt(0);
            data=data + symbol;
        }

        for(int i=data.length()-1;i>=0 ;i--){
            System.out.printf(data.charAt(i) + " ");


        }
    }
}