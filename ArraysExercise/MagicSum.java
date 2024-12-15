package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int number=Integer.parseInt(scanner.nextLine());

        for(int i=0 ;i<numbers.length ;i++){
            for(int j=i+1;j<numbers.length ;j++){
                if(numbers[i] + numbers[j]==number){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }


//        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();//1 7 6 2 19 23
//         int givenNumber=Integer.parseInt(scanner.nextLine());                                                                                                              //8
//
//        for(int index=0 ;index<numbers.length ;index++){//1 7 6 2 19 23
//            int currentNum=numbers[index];
//
//            for(int i=index+1 ;i<numbers.length ;i++){
//                int number2=numbers[i];
//                if(currentNum + numbers[i]==givenNumber){
//                    System.out.printf("%d %d%n",currentNum,number2);
//                }
//            }
//        }



    }
}
