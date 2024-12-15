package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        int []numbers= Arrays.stream(input.split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        for(int i=0 ;i<= numbers.length-1 ;i++){
            int currentNumber=numbers[i];//14 24 3 19 15 17

            if(i==numbers.length-1){
                System.out.println(currentNumber + " ");
                break;
            }

            boolean isTop=false;
            for(int index=i + 1 ;index<=numbers.length-1 ;index++){
                int nextNumber=numbers[index];

                if(currentNumber>nextNumber){
                    isTop=true;
                }else{
                    isTop=false;
                    break;
                }
            }
            if(isTop){
                System.out.print(currentNumber + " ");
            }

        }

    }
}
