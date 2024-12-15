package DataTypeAndVariables;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        40 ot 100
        String firstName=scanner.nextLine();
        String secondName=scanner.nextLine();
        char delimiter=scanner.nextLine().charAt(0);


        System.out.printf("%s%s%s",firstName,delimiter,secondName);



    }
}
