package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        boolean isTrue=false;

        for(int index=0 ;index<numbers.length ;index++){//10 5 5 99 3 4 2 5 1 1 4
            int currentElement=numbers[index];
            int leftSum=0;
            int rightSum=0;

            for(int i=0 ;i<index ;i++){
                leftSum=leftSum+numbers[i];
            }
            for(int j=index+1 ;j<numbers.length ;j++){
                rightSum=rightSum+numbers[j];
            }
            if(leftSum==rightSum){
                System.out.println(index);
                isTrue=true;
                break;
            }
        }
        if(!isTrue){
            System.out.println("no");
        }


    }
}
