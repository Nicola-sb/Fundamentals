package TextProcesingExercise;

import java.util.Scanner;

public class StringProcesing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for(int i=0 ;i<n ;i++){
            String[]inputArr=scanner.nextLine().split(" ");

            System.out.println(getName(inputArr)+" is "+getAge(inputArr)+" years old.");
        }

    }

    public static String getName(String[]inputArr){
             String myName="";
        for (String word:inputArr){
            if(word.contains("@")){//@George|
                char firstLetter=word.charAt(0);
                char secondLetter=word.charAt(word.length()-1);
                String name=(word.replace(firstLetter,' ').replace(secondLetter,' ').trim());
                myName=name;
            }
        }

        return myName;
    }

    public static String getAge(String[]inputArr){
        String myAge="";
        for (String word:inputArr){
            if(word.contains("#")){
                char firstLetter=word.charAt(0);
                char secondLetter=word.charAt(word.length()-1);
                String age=(word.replace(firstLetter,' ').replace(secondLetter,' ').trim());
                myAge=age;
            }
        }
        return myAge;
    }
//public static int getAge(String[]inputArr){
//        int myAge=0;
//        for (String word:inputArr){
//            if(word.contains("#")){
//                char firstLetter=word.charAt(0);
//                char secondLetter=word.charAt(word.length()-1);
//                int age=Integer.parseInt(word.replace(firstLetter,' ').replace(secondLetter,' ').trim());
//                myAge=age;
//            }
//        }
//        return myAge;
//    }


}
