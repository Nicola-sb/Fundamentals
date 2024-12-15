package List;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class SumAdjacentEqualsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Double> adjacentNumber= Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
         //3 3 6 1
        for(int i=0 ;i<adjacentNumber.size()-1 ;i++){
            double firstElement=adjacentNumber.get(i);
            double secondElement=adjacentNumber.get(i+1);
            if(firstElement==secondElement){
                adjacentNumber.set(i,adjacentNumber.get(i)+adjacentNumber.get(i+1));
                adjacentNumber.remove(i+1);
                i=-1;
            }

        }

        System.out.println(printResult(adjacentNumber, " "));
    }
    public static String printResult(List<Double> somelist,String razdelitel){
        String result="";
        for (double element:somelist){
            DecimalFormat df=new DecimalFormat("0.#");

            String someFormat= df.format(element) + razdelitel;
            result+=someFormat;
        }
        return result;
    }
}
