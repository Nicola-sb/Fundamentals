package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>firstPlayerCards= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer>secondPlayerCards= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //20 30 40 50
        //10 20 30 40

        while (firstPlayerCards.size()!=0 && secondPlayerCards.size()!=0){
            int firstCardFirstPlaye=firstPlayerCards.get(0);//20
            int firstCardSecondtPlayer=secondPlayerCards.get(0);//10
            firstPlayerCards.remove(0);//20 --> 30,40,50
            secondPlayerCards.remove(0);//10 --> 20,30,40

            if(firstCardFirstPlaye > firstCardSecondtPlayer){//20>10
                firstPlayerCards.add(firstCardFirstPlaye);//30,40,50,20
                firstPlayerCards.add(firstCardSecondtPlayer);//30,40,50,20,10
            }else if(firstCardSecondtPlayer>firstCardFirstPlaye){
                secondPlayerCards.add(firstCardSecondtPlayer);
                secondPlayerCards.add(firstCardFirstPlaye);
            }
        }

        //цикъла ще приключи при 2 случая
        //1.Ако на първия му свършат картите
        if(firstPlayerCards.size()==0){
            System.out.printf("Second player wins! Sum: %d",sumCard(secondPlayerCards));
        }
        //2.Ако на втория му свършат картите
        else if(secondPlayerCards.size()==0){
            System.out.printf("First player wins! Sum: %d",sumCard(firstPlayerCards));
        }
    }
    public static int sumCard(List<Integer>cards){
        int sum=0;
        for(int element:cards){
            sum=sum+element;
        }
        return sum;

    }
}
