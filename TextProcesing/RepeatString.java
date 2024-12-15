package TextProcesing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]textToPrint=scanner.nextLine().split(" ");//масив в който си държа думите
        //hi abc add ->>hihiabcabcabcaddaddadd
        //имам 3 елемента в този масив(hi,abc,add)-->трябва да взема всяка една от думите(-->currentWord=textToPrint[i])
        //Да попитам каква е дължината на думата(hi) --> int lenght=currentWord.lenght
        //След като знам колко е дължината да повторя толкова пъти тази дума.Това го правя чрез метод getRepeat
        List<String>repeatList=new ArrayList<>();//в листа си съхрнавям повторениет
        for(int i=0 ;i< textToPrint.length ;i++){//hi abc add
            String currentWord=textToPrint[i];//hi
            int lenght=currentWord.length();//дължината е 2 букви

//            repeatList.add(getRepeat(currentWord,lenght)); същото самоче описано на 2 реда -->
            String repeatWord=getRepeat(currentWord,lenght);
            repeatList.add(repeatWord);
        }
        System.out.println(String.join("",repeatList));
    }

    public static String getRepeat(String word,int size){//създавам си метод
        String result="";
        for(int i=0 ;i<size ;i++){//интерирам 2 пъти думата hi
            result=result+word;//като ресултат-> ""=""+hi --> hi=hi+hi --> result: hihi
        }
        return result;//Връшам резултата от метода,който в случая ми е hihi
    }
}
