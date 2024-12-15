package Arrays;

import java.util.Scanner;

public class PrintNumberesInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n=Integer.parseInt(scanner.nextLine());

       int[] numberArrays=new int[n];

       for(int i=0;i<numberArrays.length ;i++){
           numberArrays[i]=Integer.parseInt(scanner.nextLine());
       }
       for(int i=numberArrays.length-1;i>=0 ;i--){
           System.out.print(numberArrays[i]+ " ");
       }

    }
}
