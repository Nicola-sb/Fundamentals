package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]rooms=scanner.nextLine().split("\\|");
        //rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000
        boolean isDead=false;
        int healt=100;
        int bitcoin=0;
        for(int i=0 ;i< rooms.length ;i++){
            String[]currentRoom=rooms[i].split(" ");
            String command=currentRoom[0];
            int numbert=Integer.parseInt(currentRoom[1]);
            switch (command){
                case "potion":
                    int diffHealth= 100 - healt;
                    healt=healt+numbert;
                    if(healt>100){
                        numbert=diffHealth;
                        healt=100;
                    }
                    System.out.printf("You healed for %d hp.%n",numbert);
                    System.out.printf("Current health: %d hp.%n",healt);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n",numbert);
                    bitcoin=bitcoin+numbert;
                    break;
                default:
                    healt=healt-numbert;
                    if(healt <=0){
                        isDead=true;
                        System.out.printf("You died! Killed by %s.%n",command);
                        System.out.printf("Best room: %d%n",i+1);
                    }else{
                        System.out.printf("You slayed %s.%n",command);
                    }
                    break;
            }

            if(isDead){
                break;
            }
        }
        if(healt>0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d", healt);
        }
    }
}
