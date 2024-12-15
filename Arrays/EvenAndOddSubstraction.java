package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String []input=scanner.nextLine().split(" ");

        int []numbers=new int[input.length];

        int evenSum=0;
        int oddSum=0;

        for(int i=0 ;i<numbers.length ;i++){
            numbers[i]=Integer.parseInt(input[i]);
        }

        for (int num:numbers) {
            if(num % 2 ==0){
                evenSum=evenSum+num;
            }else{
                oddSum=oddSum+num;
            }
        }
        int diff=evenSum-oddSum;
        System.out.println(diff);

//        String inputLine=scanner.nextLine();
//
//        int []numbers= Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        int evenSum=0;
//        int oddSum=0;
//
//        for(int i=0 ;i<numbers.length ;i++){
//            int currentNum=numbers[i];
//
//            if(currentNum % 2==0){
//                evenSum=evenSum+currentNum;
//            }else{
//                oddSum=oddSum+currentNum;
//            }
//        }
//        int allSum=evenSum-oddSum;
//        System.out.println(allSum);


    }
}
