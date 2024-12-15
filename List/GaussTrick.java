package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //1 2 3 4 5
        //first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n   //6 6 3
        //1.Трябва да сумирам 1 и 5 // 6
        //1.2 Трябва да сумирам 1 + 1 + последната -1 // 6
        //1.3Трябва да сумирам  1 + 2 + последната - 2 // 3
        //1.5 Трябва да сумирам 1 + 3 + последната - 3
         int numSize=numbersInput.size();
        for(int i=0 ;i<numSize / 2 ;i++){
            int firstElement=numbersInput.get(i);//1
            int secondElelemnt=numbersInput.get(numbersInput.size()-1);//5
            numbersInput.set(i,firstElement+secondElelemnt);
            numbersInput.remove(numbersInput.size()-1);
        }

//        System.out.println(numbersInput.toString().replaceAll("[\\[\\],]", ""));

        for (int number:numbersInput){
            System.out.print(number + " ");
        }



    }
}
