package TextProcesing;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String firstString=scanner.nextLine();
      String secondString=scanner.nextLine();

      int index=secondString.indexOf(firstString);
      while (secondString.contains(firstString)){
          secondString=secondString.replace(firstString,"");
      }
        System.out.println(secondString);



    }
}
