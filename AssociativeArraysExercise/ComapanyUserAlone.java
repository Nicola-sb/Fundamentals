package AssociativeArraysExercise;

import java.util.*;

public class ComapanyUserAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String, List<String>>companies=new LinkedHashMap<>();
        while (!command.equals("End")){
         String companyName=command.split("->")[0];
         String employeeR=command.split("->")[1];

         if(companies.containsKey(companyName)){
             List<String>employees=companies.get(companyName);
             if(!employees.contains(employeeR)){
                 employees.add(employeeR);
             }
         }else{
             List<String>employees=new ArrayList<>();
             employees.add(employeeR);
             companies.put(companyName,employees);
         }
            command=scanner.nextLine();
        }

        companies.entrySet().stream().forEach(company -> {
            System.out.println(company.getKey());
            company.getValue().forEach(player-> System.out.println("--"+player));
        });

    }
}
