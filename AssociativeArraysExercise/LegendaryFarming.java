package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,Integer>legendaryFarming=new LinkedHashMap<>();
        legendaryFarming.put("shards",0);
        legendaryFarming.put("fragments",0);
        legendaryFarming.put("motes",0);
        Map<String,Integer>trashMapFarming=new LinkedHashMap<>();
        boolean isAlive=false;
        while (!isAlive) {
            String inputLine = scanner.nextLine();
            String[] arrayInput = inputLine.split(" ");
            for (int i = 0; i < arrayInput.length; i += 2) {
                int quantity = Integer.parseInt(arrayInput[i]);
                String material = arrayInput[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int valueFarming = legendaryFarming.get(material);
                    legendaryFarming.put(material, valueFarming + quantity);
                } else {
                    if (!trashMapFarming.containsKey(material)) {
                        trashMapFarming.put(material, quantity);
                    } else {
                        int valueTrash = trashMapFarming.get(material);
                        trashMapFarming.put(material, valueTrash + quantity);
                    }
                }

                if (legendaryFarming.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                   legendaryFarming.put("shards",legendaryFarming.get("shards")-250);
                    isAlive=true;
                    break;
                } else if (legendaryFarming.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    legendaryFarming.put("fragments",legendaryFarming.get("fragments")-250);
                     isAlive=true;
                     break;
                } else if (legendaryFarming.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    legendaryFarming.put("motes",legendaryFarming.get("motes")-250);
                     isAlive=true;
                     break;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : legendaryFarming.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : trashMapFarming.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }


    }
}
