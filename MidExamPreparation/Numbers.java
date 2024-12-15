package MidExamPreparation;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[]numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       //10 20 30 40 50

        double sum=0;
        for(int i=0 ;i<=numbers.length-1 ;i++){
            int currentNum=numbers[i];
            sum=sum+currentNum;

        }
        double averrage=sum/ numbers.length;
        //averrage = 30 - > трябва да изпринтриам числата които са по-големи от 30

        List<Integer> listNumber=new ArrayList<>();
         for(int i=0 ;i<= numbers.length-1 ;i++){
             int currentNum=numbers[i];
             if(currentNum>averrage){
                 listNumber.add(currentNum);
             }
         }
        Collections.sort(listNumber);
        Collections.reverse(listNumber);


             if(listNumber.size() > 5){
                 for(int i=0 ;i<5 ;i++){
                     System.out.print(listNumber.get(i) + " ");
                 }
             }else if(listNumber.size()==0){
                 System.out.println("No");
             }else{
                 System.out.print(listNumber.toString().replaceAll("[\\[\\],]",""));
             }


    }
}
