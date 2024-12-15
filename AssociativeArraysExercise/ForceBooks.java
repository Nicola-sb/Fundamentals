package AssociativeArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class ForceBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String input=scanner.nextLine();
        Map<String, List<String>> map=new LinkedHashMap<>();
        //трябва да знам в моят отбор списъка с играчи.В речника си ги държа .Като ключ ще имам Стринг(страната),а Лист ще ми е списъка с плейъри
        while (!input.equals("Lumpawaroo")){
          if(input.contains("|")){
              //"{force_side} | {force_user}".split( " | " )-->["{force_side}","{force_user}"]
              String team=input.split(" | ")[0];
              String player=input.split(" | ")[2];
//           проверка дали имаме отбора
              if(!map.containsKey(team)) {
                  //отбор-->празен списък за играчите
                  map.put(team, new ArrayList<>());
                  map.get(team).add(player);
              }else{
                  //имаме такъв отбор-->добавяме към отбора играча,ако го няма
                  List<String>currentPlayers=map.get(team);//текущ списък с играчите
                  if(!currentPlayers.contains(player)){
                      currentPlayers.add(player);
                      map.put(team,currentPlayers);
                  }

              }
          }else if(input.contains(" -> ")){
              //"{force_user} -> {force_side}"
              String player=input.split(" -> ")[0];
              String team=input.split(" -> ")[1];
              //1.Ако играча го има в някой от отборите трябва да го премахна ==>remove
              map.entrySet().forEach(entry -> entry.getValue().remove(player));//Обхождам си всичките тимове и ако там има играч със същото име го премахвам
              //2.Проверка дали съществува отбора в който иска да отиде
              if(map.containsKey(team)){
                  List<String>currentPlayers=map.get(team);
                  currentPlayers.add(player);
                  map.put(team,currentPlayers);
              }else{
                  //ако нямаме такъв отбор
                  //създавме си отбора и към неговият списък си добавяме playera
                  map.put(team,new ArrayList<>());
                  map.get(team).add(player);
              }
              //Then you should print on the console: "{force_user} joins the {force_side} side!".
              System.out.println(player+" joins the "+ team+" side!");
          }
          input=scanner.nextLine();
      }
//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//            System.out.println("Side: "+ entry.getKey()+", Members: "+ entry.getValue().size());
//            entry.getValue().forEach(entryy-> System.out.println("! "+entryy));
//        } По това принтираме ми излиза и Side:Darker,Members 0.По условие трябва ако играчите са нула да не се принтират
        //на долното принтиране е правилния начин

        map.entrySet().stream().filter(entry -> entry.getValue().size()>0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(player-> System.out.println("! "+player));
                });
    }
    }

