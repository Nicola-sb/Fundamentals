package ExerciseMethods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int n){//3
        for(int row=1 ;row<=n ;row++){
            for(int col=1 ;col<=n;col++){
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }

}
