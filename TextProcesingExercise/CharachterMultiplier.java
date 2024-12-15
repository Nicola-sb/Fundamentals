package TextProcesingExercise;

import java.util.Scanner;

public class CharachterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] text1 = text.split(" ")[0].toCharArray();//George
        char[] text2 = text.split(" ")[1].toCharArray();//Peter


        int maxText = Math.max(text1.length, text2.length);
        int minText=Math.min(text1.length,text2.length);

        int sum=0;
        for(int i=0 ;i<maxText ;i++){
            if(i<minText){
                sum=sum+text1[i]*text2[i];
            }else if(text1.length > text2.length){
                sum=sum+text1[i];
            }else{
                sum=sum+text2[i];
            }
        }
        System.out.println(sum);
    }
}
