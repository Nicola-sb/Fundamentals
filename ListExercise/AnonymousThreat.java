package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>text=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        //merge {startIndex} {endIndex}
        //divide {index} {partitions}
        String command=scanner.nextLine();
        while (!command.equals("3:1")){
            if(command.contains("merge")){
                int startIndex=Integer.parseInt(command.split(" ")[1]);
                int endIndex=Integer.parseInt(command.split(" ")[2]);
                if(startIndex<0){
                    startIndex=0;
                }
                if(endIndex>text.size()-1){
                    endIndex=text.size()-1;
                }
                boolean isValid= startIndex <= text.size() - 1 && endIndex >= 0 && startIndex < endIndex;
                if(isValid){
                    String resultMerge="";
                    for(int i=startIndex ;i<=endIndex ;i++){
                        String currentIndex=text.get(i);
                        resultMerge=resultMerge+currentIndex;
                    }
                    //remove
                    for(int i=startIndex ;i<=endIndex ;i++){
                        text.remove(startIndex);
                    }
                    text.add(startIndex,resultMerge);
                }

            }else if(command.contains("divide")){
                 //divide 4 5--> divede 4 5 .split("")->["divide","4","5";
                int index=Integer.parseInt(command.split(" ")[1]);//4
                int part=Integer.parseInt(command.split(" ")[2]);//части  5

                String elementToDivide=text.get(index);
                //елемента който е на 4ти индекс трябва да го разделя на 5 части
                text.remove(index);

                //колко елемента ще има всяка част
                int partSize=elementToDivide.length() / part;
                int beginIndexOfText=0;
                for(int i=1 ;i<part ;i++){
                  text.add(index,elementToDivide.substring(beginIndexOfText,beginIndexOfText+partSize));
                  index++;
                  beginIndexOfText=beginIndexOfText+partSize;
                }
                //добавяваме останалите символи към последната част
                text.add(index,elementToDivide.substring(beginIndexOfText));
            }
            command=scanner.nextLine();
        }
        for (String element:text){
            System.out.print(element+ " ");
        }

//        System.out.print(String.join(" ",text));

    }
}
