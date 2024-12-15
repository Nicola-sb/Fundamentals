package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoListExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer>secondPlayerCards= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerCards.size()!=0 && secondPlayerCards.size()!=0){
            int firstPlayerFirstCard=firstPlayerCards.get(0);
            int secondPlayerFirstCard=secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);
            if(firstPlayerFirstCard>secondPlayerFirstCard){
                firstPlayerCards.add(firstPlayerFirstCard);
                firstPlayerCards.add(secondPlayerFirstCard);
            }else if(secondPlayerFirstCard>firstPlayerFirstCard){
                secondPlayerCards.add(secondPlayerFirstCard);
                secondPlayerCards.add(firstPlayerFirstCard);
            }
        }
        if(firstPlayerCards.size()==0){
            System.out.printf("Second player wins! Sum: %d",sumCard(secondPlayerCards));
        }else{
            System.out.printf("First player wins! Sum: %d",sumCard(firstPlayerCards));
        }
    }
    public static int sumCard(List<Integer>listSum){
        int sum=0;
        for(int element:listSum){
            sum=sum+element;
        }
        return sum;
    }
}
