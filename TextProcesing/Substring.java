package TextProcesing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove=scanner.nextLine();
        String text=scanner.nextLine();
        //ice
        //kicegiciceeb

        //1.kgiciceeb
        //2.kgiceb
        //3.kgb
        int index=text.indexOf(toRemove);
        while (index!=-1){
        text=text.replace(toRemove,"");
         //s replace замествам стария чар,с новия,който искам да поставя на негово място
         //стария който искам да премахна е toRemove С новият който е ""(празен стринг)(по този начин все едно си го изтривам) за да ми се получи
         // от kicegiciceeb ->> kgiciceeb

         //така обаче продължавам да имам един безкраен while цикъл
         //създавам си променлива която да ми държи индеска
         //по този начин си взимам началния индекс на toRemove в текса
   //всеки път кога премахна тази дума питам кой ми е индекса.Защото всеки пък когато имам replace ми се размества text и трябва да попитам от кой идекс започва
          index=text.indexOf(toRemove);
          //условието мога да си го създам като попитам дали индекса ми е различен от -1(т.е. вече toRemove не се съдържа в тескта)
          //-->останали са само kgb( в kgb не се съдържа ice и заради това ще ми върне -1)
          //index=text.indexOf(toRemove); с това търсим индекса и когато ни върне -1 приключва цикъла
        }
        //методът replace не променя стринга.Той е unmutable.Просто се създава нов обект в паметта.

        System.out.println(text);

    }
}
