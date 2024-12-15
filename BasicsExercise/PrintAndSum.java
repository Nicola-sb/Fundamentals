package BasicsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum=Integer.parseInt(scanner.nextLine());
        int endNum=Integer.parseInt(scanner.nextLine());

        int totalSum=0;
         // 5,10 totalsum 45       5 6 7 8 9 10

        for(int i=startNum;i<=endNum ;i++){
            System.out.print(i + " ");
          totalSum=totalSum+i;
        }
        System.out.println();
        System.out.printf("Sum: %d",totalSum);
    }
}
