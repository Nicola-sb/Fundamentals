package TextProcesingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        //abv>1>1>2>2asdasd
        StringBuilder text=new StringBuilder(input);
        //правя си StringBuilder за да си мога да си манипулирам текста

        int totalAttack=0;
        //обхождам си всички симоволи в текста abv>1>1>2>2asdasd
        for(int i=0 ;i<text.length() ;i++){
            char currentSymbol= text.charAt(i);//взимам всеки един символ --> а

            if(currentSymbol == '>'){
                int attackPower=Integer.parseInt(text.charAt(i+1)+""); //така взимам силата на атаката след символа >
                totalAttack=totalAttack+attackPower;
            }else if(currentSymbol!='>'&& totalAttack>0){
                text.deleteCharAt(i);
//           text.deleteCharAt(i);  == text.delete(i,i+1);
                totalAttack--;
                i--;
            }
        }
        System.out.println(text);
    }
}
