package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Не е решена

        int numberCommand=Integer.parseInt(scanner.nextLine());
        List<String> guestList=new ArrayList<>();

        for(int i=0 ;i<numberCommand ;i++){
            String commingGuest=scanner.nextLine();
            String[]data=commingGuest.split("\\s+ ");
            String name=data[0];
            //"{name} is going!"
            //"{name} is not going!"
            if(!commingGuest.contains("not")){
                if(guestList.contains(name)){
                    System.out.printf("%s is already in the list!",name);
                }else{
                    guestList.add(name);
                }
            }else{
                if(guestList.contains(name)){
                    guestList.remove(name);
                }else{
                    System.out.printf("%s is not in the list!",name);
                }
            }
        }
        for (String element:guestList){
            System.out.println(element);
        }
    }
}
