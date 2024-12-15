package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarityMap = new LinkedHashMap<>();
        Map<String, Double> rateMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] plantInformation = scanner.nextLine().split("<->");
            String plant = plantInformation[0];
            int rarity = Integer.parseInt(plantInformation[1]);

            plantRarityMap.put(plant, rarity);
            rateMap.put(plant, 0.0);

            String command = scanner.nextLine();
            while (!command.equals("Exhibition")) {
                String[] someInfo = command.split("[: -]+");//Rate: Woodii - 10
                String firstCommand = someInfo[0];
//                String  = someInfo[1];
//
//                if (!plantRarityMap.containsKey(plant)) {
//                    System.out.println("error");
//                } else {
//                    switch (firstCommand) {
//                        case "Rate":
//                            double value = Double.parseDouble(someInfo[2]);
//                            if (rateMap.get(plantWhile) == 0) {
//                                rateMap.put(plantWhile, value);
//                            } else {
//                                double newRate = rateMap.get(plantWhile) + value;
//                                rateMap.put(plantWhile, newRate);
//                            }
//                            break;
//                        case "Update":
//                            int rariry = Integer.parseInt(someInfo[2]);
//                            plantRarityMap.put(plantWhile, rariry);
//                            break;
//                        case "Reset":
//                            rateMap.put(plantWhile, 0.0);
//                            break;
//                    }
//                }
                command = scanner.nextLine();
            }


            System.out.println("Plants for the exhibition:");
            for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
                System.out.printf("- %s; Rarity: %d; Rating: %.2f", entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));
            }
        }
    }
}