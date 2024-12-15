package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[]numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();//[23 -2 321 87 42 90 -123]

        String command=scanner.nextLine();
        //"swap {index1} {index2}"-> ["swap","3","4"]
        //"multiply {index1} {index2}" ->["multiply","3","4"]
        //"decrease -> ["decrease"]
        while (!command.equals("end")){
            String[]commandParts=command.split(" ");//"23 -2 321 87 42 90 -123"
            String commandType=commandParts[0];//"swap","multiply","decrease"
            switch (commandType){
                case "swap"://swap 3 4
                    //изпълняваме командата swap-> ["swap","3","4"]
                    int index1=Integer.parseInt(commandParts[1]);//3
                    int element1=numbers[index1];//3
                    int index2=Integer.parseInt(commandParts[2]);//4
                    int element2=numbers[index2];//4
                    numbers[index1]=element2;
                    numbers[index2]=element1;
                    break;
                case "multiply":
                    int multiplyElIndex1=Integer.parseInt(commandParts[1]);
                    int elementMulti1=numbers[multiplyElIndex1];
                    int multiplyElIndex2=Integer.parseInt(commandParts[2]);
                    int elementMulti2=numbers[multiplyElIndex2];
                    int sum=elementMulti1*elementMulti2;
                    numbers[multiplyElIndex1]=sum;
                    break;
                case "decrease":
                    for(int i=0 ;i< numbers.length ;i++){
                        numbers[i]= numbers[i]-1;
                    }
                    break;
            }
            command=scanner.nextLine();
        }

        for(int i=0 ;i< numbers.length ;i++){
            if(i != numbers.length-1){
                System.out.print(numbers[i]+ ", ");
            }else{
                System.out.println(numbers[i]);
            }


        }
    }
}
