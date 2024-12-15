package TextProcesingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();//A12b s17G
        String [] lettersArr=input.split("\\s+");//["A12b","s17G"]//splitwam //s+ защото мога да имам повече от един интервали
        // код::  {буква}{число}{буква}

        //Обхождам си всяка една дума(код) в масива с forEach
        double totalSum=0;//сума от числата на всичките кодове(думи)
        for (String code:lettersArr){
           //пресмятане на числото
            double numberOne=getModifiedNumber(code);
           //добавяме крайното число от кода(думата) към общата сума
            totalSum=totalSum+numberOne;
        }
        System.out.printf("%.2f",totalSum);

    }

    private static double getModifiedNumber(String code) {    //  A12b
        // код::  {буква}{число}{буква}
        //трябва да взема числото и да го модифирам спрямо буквата отпред и буквата отзад и накрая да върна числото
        char firstLetter=code.charAt(0);//така си взимам първата буква ->> от A12b --> получавам А
        char secondLetter=code.charAt(code.length()-1);//така си взимам последната буква --> от A12b -->> b

        //от A12b трябва да си взема и числото между буквите
        double number=Double.parseDouble(code.replace(firstLetter,' ') // "A12b" replace --> " 12b"
                                              .replace(secondLetter, ' ')//// " 12b" --->> " 12 "
                                               .trim());     // .trim ми премахва излизшните интервали в началото и в края

        //проверките за първата буква-->firstLetter
        if(Character.isUpperCase(firstLetter)){
            //глава буква
            //аски код между 65 - 90
            //Ако е главна буква трябва да взема моето число на да го разделя на позицията на буквата в азбуката -->
            int possitionUpperLetter=(int)firstLetter-64;
            //намиране на позицята в азбуката--> взимаме аски кода(int) на моята буква(firesLetter) и от него изваждам 64
            number=number / possitionUpperLetter;
        }else{
            //малка буква
            //аски код между 97 - 122
            int possitionLowerLetter=(int)firstLetter-96;
            number=number*possitionLowerLetter;
        }
        //Проверки за втората буква --> secondLetter
        if(Character.isUpperCase(secondLetter)){
            //глава буква
            //аски код между 65 - 90
            int possitionUpperLetter=(int)secondLetter-64;
            number=number - possitionUpperLetter;
        }else{
            //малка буква
            //аски код между 97 - 122
            int possitionLowerLetter=(int)secondLetter-96;
            number=number+possitionLowerLetter;
        }
        return number;

    }

}

