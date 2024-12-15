package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>distancePokemons= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //{4,5,3}

        //1. index е в листът (index > 0 && index <= дължината -1(последният индекс)
        //2.index < 0
        //3.index > последния индекс
        //стоп:листът с покемони е празен
        //продължаваме ->листът е пълен
        int sum=0;
        while (distancePokemons.size()>0){
            int index=Integer.parseInt(scanner.nextLine());

            if(index >=0 && index <=distancePokemons.size()-1){
               int removedElement=distancePokemons.get(index);
               sum=sum+removedElement;
               distancePokemons.remove(index);

                changeElements(distancePokemons, removedElement);
            }else if(index<0){
                int removedElementFirst=distancePokemons.get(0);
                sum=sum+removedElementFirst;
                int lastElement=distancePokemons.get(distancePokemons.size()-1);
                distancePokemons.set(0,lastElement);
                changeElements(distancePokemons,removedElementFirst);

            }else if(index > distancePokemons.size()-1){
                int removedElelemntLast=distancePokemons.get(distancePokemons.size()-1);
                sum=sum+removedElelemntLast;
                 int firstElement=distancePokemons.get(0);
                 distancePokemons.set(distancePokemons.size()-1,firstElement);
                changeElements(distancePokemons,removedElelemntLast);
            }
        }
        System.out.println(sum);

    }

    private static void changeElements(List<Integer> distancePokemons, int removedElement) {
        for(int i = 0; i<= distancePokemons.size()-1 ; i++){
            int currentElelemnt= distancePokemons.get(i);
            if(currentElelemnt <= removedElement){
                currentElelemnt=currentElelemnt+ removedElement;
                distancePokemons.set(i,currentElelemnt);
            }else{
                //You must DECREASE the value of all elements in the sequence which are GREATER than the removed element,
                // with the value of the removed element
                 currentElelemnt=currentElelemnt- removedElement;
                 distancePokemons.set(i,currentElelemnt);
            }
        }
    }
}
