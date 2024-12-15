package BasicsSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());



//не е довършена.Да проверя решението във фейсбукгрупата
        while (number%2!=0){
            if(number%2==0){
                System.out.printf("The number is: %d",Math.abs(number));
            }

            System.out.println("Please write an even number.");
            number=Integer.parseInt(scanner.nextLine());

        }
    }
}
