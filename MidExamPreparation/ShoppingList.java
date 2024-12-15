package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>shoppingList= Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        //Tomatoes!Potatoes!Bread
        String command=scanner.nextLine();
        //4 types of command
        //1.Ako командата е Urgnet --> •Urgent {item} - add the item at the start of the list.  If the item already exists, skip this command.
        //2.•Unnecessary {item} - remove the item with the given name, only if it exists in the list. Otherwise skip this command.
        //3.•Correct {oldItem} {newItem} – if the item with the given old name exists, change its name with the new one. If it doesn't exist, skip this command.
        //4.•Rearrange {item} - if the grocery exists in the list, remove it from its current position and add it at the end of the list
        while (!command.equals("Go Shopping!")){
                  if(command.contains("Urgent")){//Urgent Tomatoes
                      String firstElement=command.split(" ")[1];//Tomatos
                      if(!shoppingList.contains(firstElement)){
                          shoppingList.set(0,firstElement);
                      }
                  }else if(command.contains("Unnecessary")){
                      String unnecessaryItem=command.split(" ")[1];
                      shoppingList.remove(unnecessaryItem);
                  }else if(command.contains("Correct")){
                      String oldItem=command.split(" ")[1];
                      String newItem=command.split(" ")[2];
                          for(int i=0 ;i<=shoppingList.size()-1 ;i++){
                              if(shoppingList.get(i).equals(oldItem)){
                                  shoppingList.set(i,newItem);
                              }
                          }
//                          int newIndex= shoppingList.indexOf(oldItem);
//                          shoppingList.set(newIndex,newItem);

                  }else if(command.contains("Rearrange")){
                      String itemRearrange=command.split(" ")[1];
                      if(shoppingList.contains(itemRearrange)){
                          shoppingList.remove(itemRearrange);
                          shoppingList.add(itemRearrange);
                      }
                  }
            command=scanner.nextLine();
        }
        System.out.println(String.join(", ",shoppingList));
    }
}
