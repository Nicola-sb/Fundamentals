package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        String[]firstArray=new String[n];
        String[]secondArray=new String[n];

        for(int i=0 ;i<n ;i++){
            String inputLine=scanner.nextLine();
            String firstNum=inputLine.split(" ")[0];
            String secondNum=inputLine.split(" ")[1];

// с (i+1) си достъпвам номера на реда
            if((i+1) % 2 ==1){
                firstArray[i]=firstNum;
                secondArray[i]=secondNum;
            }else{
                firstArray[i]=secondNum;
                secondArray[i]=firstNum;
            }
        }

        for (String element:firstArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (String element:secondArray) {
            System.out.print(element + " ");
        }



    }
}
