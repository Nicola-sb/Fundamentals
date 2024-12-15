package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] num2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int maxLenght=Math.max(num1.length,num2.length);
        boolean areNotTheSame=false;
        int sum=0;

        for(int i=0 ;i<maxLenght ;i++){
            sum=sum + num1[i];

            if(num1[i] != num2[i] ){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                areNotTheSame=true;
                break;
            }
        }
        if(areNotTheSame==false){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
