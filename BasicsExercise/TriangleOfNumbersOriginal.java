package BasicsExercise;

import java.util.Scanner;

public class TriangleOfNumbersOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for(int rows=1;rows<=n ;rows++){
            for(int col=1;col<=rows ;col++){
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}
