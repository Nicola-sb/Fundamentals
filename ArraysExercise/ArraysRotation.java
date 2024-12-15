package ArraysExercise;

import java.util.Scanner;

public class ArraysRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []inputLite=scanner.nextLine().split(" ");
        int n=Integer.parseInt(scanner.nextLine());

        for(int rotation=1 ;rotation<=n ;rotation++){
            String currentElement=inputLite[0];

            for(int i=0;i<inputLite.length-1 ;i++){
              inputLite[i]=inputLite[i+1];
              //така си измезватм елементите с един наляво
            }
            inputLite[inputLite.length-1]=currentElement;
        }
        for (String element:inputLite){
            System.out.print(element + " ");
        }
    }
}
