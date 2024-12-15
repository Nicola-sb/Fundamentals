package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstListNumber= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondListNumber= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//        3 5 2 43 12 3 54 10 23
//        76 5 34 2 4 12

        List<Integer> resultList=new ArrayList<>();

        int minList=Math.min(firstListNumber.size(),secondListNumber.size());

        for(int i=0 ;i<minList ;i++){
            int firstElement=firstListNumber.get(i);
            int secondElelemtn=secondListNumber.get(i);

            resultList.add(firstElement);
            resultList.add(secondElelemtn);
        }

        if(firstListNumber.size()>secondListNumber.size()){
            resultList.addAll(firstListNumber.subList(minList,firstListNumber.size()));
        }else{
            resultList.addAll(secondListNumber.subList(minList,secondListNumber.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
