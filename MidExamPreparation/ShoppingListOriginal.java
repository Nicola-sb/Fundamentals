package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingListOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList= Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String inputLine=scanner.nextLine();
        while (!inputLine.equals("Go Shopping!")){
            String[]commandAr=inputLine.split(" ");
            String firstCommand=commandAr[0];

            switch (firstCommand){
                case "Urgent":
                    String secondItem=commandAr[1];
                    if(!shoppingList.contains(secondItem)){
                        shoppingList.add(0,secondItem);
                    }
                    break;
                case "Unnecessary":
                    String secondItemUnnecessary=commandAr[1];
                    //remove the item with the given name, only if it exists in the list. Otherwise skip this command.
                    shoppingList.remove(secondItemUnnecessary);
                    break;
                case "Correct":
                    String oldItem=commandAr[1];
                    String newItem=commandAr[2];
                    //Correct {oldItem} {newItem} – if the item with the given old name exists,
                    // change its name with the new one. If it doesn't exist, skip this command
                    if(shoppingList.contains(oldItem)){
                        int newIndex=shoppingList.indexOf(oldItem);
                        shoppingList.set(newIndex,newItem);

                    }
                    break;
                case "Rearrange":
                    String rearrrangeItem=commandAr[1];
                    //Rearrange {item} - if the grocery exists in the list, remove it from its current position and add it at the end of the list
                    if(shoppingList.contains(rearrrangeItem)){
                        shoppingList.remove(rearrrangeItem);
                        shoppingList.add(rearrrangeItem);
                    }
                    break;
            }
            inputLine=scanner.nextLine();
        }
        System.out.println(String.join(", ",shoppingList));
    }
}
