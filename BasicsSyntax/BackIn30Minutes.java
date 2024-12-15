package BasicsSyntax;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());

        int allMin=(hours * 60) + minutes + 30;

        int hourFirst=allMin / 60;
        int minFirst=allMin % 60;

        if(hourFirst > 23){
            hourFirst=0;
        }

        if(minFirst < 10){
            System.out.printf("%d:%02d",hourFirst,minFirst);
        }else{
            System.out.printf("%d:%d",hourFirst,minFirst);
        }

    }
}
