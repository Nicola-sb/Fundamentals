package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int[] numArr = Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for(int i=0;i<numArr.length ;i++){
            int currentElement=numArr[i];

            if(currentElement % 2 ==0){
                sum=sum+currentElement;
            }
        }
        System.out.print(sum);
    }
}
