package AssociativeArraysExercise;

import java.util.*;

public class CompanyUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //75 ot 100

        String command=scanner.nextLine();
        Map<String, List<String>> companyUser=new LinkedHashMap<>();
        while (!command.equals("End")){
            String []inputLine=command.split("->");
            String companyName=inputLine[0];
            String employe=inputLine[1];

            if(!companyUser.containsKey(companyName)){
                companyUser.put(companyName,new ArrayList<>());
                companyUser.get(companyName).add(employe);
            }else{
                companyUser.get(companyName).add(employe);
            }

            command=scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyUser.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employer -> System.out.println("--"+employer));
        }

    }
}
