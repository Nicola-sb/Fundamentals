package FinalExamRegular;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        //Like-Krisi-shrips
        //Like-Krisi-soup
        int countRemove = 0;
        Map<String, List<String>> degustationMap = new LinkedHashMap<>();//държа си хора(Криси) и списък с техните храни(shrimps,soup);
        while (!inputLine.equals("Stop")) {
            String[] input = inputLine.split("\\-");
            String likeDislikePerson = inputLine.split("\\-")[0];
            String guest = inputLine.split("\\-")[1];
            String meal = inputLine.split("\\-")[2];

            if (likeDislikePerson.contains("Like")) {
//add the meal to the quest collection of meals
                //if the quest does not exist,add them ana their meal to your record.
                //if the quest already has the meal in their collection,do not add it.
//                Map<String,List<String>>degustationMap=new LinkedHashMap<>();
                if (!degustationMap.containsKey(guest)) {
                    degustationMap.put(guest, new ArrayList<>());
                    degustationMap.get(guest).add(meal);
                } else {
                    List<String> currentMeal = degustationMap.get(guest);
                    if (!currentMeal.contains(meal)) {
                        currentMeal.add(meal);
                        degustationMap.put(guest, currentMeal);
                    }
                }
            } else {//Dislike

                if (!degustationMap.containsKey(guest)) {
                    System.out.println(guest + " is not at the party.");
                    inputLine = scanner.nextLine();
                    continue;
                }

                if (degustationMap.containsKey(guest)) {
                    //{Dislike}-{guest}-{meal}
                    //Remove the meal of the quest's collection of liked meals and print
                    //{Guest} doesn't like the {meal}.
                    //You must keep the count of unliked meals of all unliked meals
                    if (!degustationMap.get(guest).contains(meal)) {
                        System.out.println(guest + " doesn't have the " + meal + " in his/her collection.");
                    } else {
                        System.out.println(guest + " doesn't like the " + meal + ".");
                        degustationMap.get(guest).remove(meal);
                        countRemove++;
                    }
                }

            }


            //-If guest does not exist print
            //{Guest} is not ot the party!
            //-If the quest does not have the meal at the like list,print:
            //{Guest} doesn't have the meal in his/her collection
            inputLine = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : degustationMap.entrySet()) {
            List<String> value = entry.getValue();
            System.out.println(entry.getKey() + ": " + String.join(", ", value));
        }
        System.out.printf("Unliked meals: %d%n", countRemove);


    }
}
