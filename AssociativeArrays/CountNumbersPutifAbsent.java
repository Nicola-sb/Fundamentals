package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class CountNumbersPutifAbsent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberstList= Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double,Integer>countNumbersMap=new TreeMap<>();

        for (double currentNum:numberstList){
            countNumbersMap.putIfAbsent(currentNum,0);
            int currentValue=countNumbersMap.get(currentNum);
            countNumbersMap.put(currentNum,currentValue+1);
        }
        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
