package DataTypeAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol=scanner.nextLine().charAt(0);

//        if(symbol >=65 && symbol <=90){
//            System.out.println("upper-case");
//        }else{
//            System.out.println("lower-case");

            if(Character.isLowerCase(symbol)){
                System.out.println("lower-case");
            }else{
                System.out.println("upper-case");
            }


//става също и
//        if(symbol >= 'A' && symbol <= 'Z'){
//            System.out.println("upper-case");
//        }
    }
}
