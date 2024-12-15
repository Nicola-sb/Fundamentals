package AssociativeArraysExercise;

import java.util.*;

public class CoursesAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String, List<String>> courseStudents=new LinkedHashMap<>();
        while (!command.equals("end")){
            String courseName=command.split(" : ")[0];
            String studentName=command.split(" : ")[1];

            if(!courseStudents.containsKey(courseName)){
                courseStudents.put(courseName,new ArrayList<>());
                courseStudents.get(courseName).add(studentName);
            }else{
                courseStudents.get(courseName).add(studentName);
            }
            command=scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseStudents.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue().size());
            entry.getValue().forEach(studentVkyrsa-> System.out.println("-- "+studentVkyrsa));

        }

    }
}
