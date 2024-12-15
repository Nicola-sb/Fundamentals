package AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        Map<String, List<String> >course=new LinkedHashMap<>();
        while (!command.equals("end")){
            String courseName=command.split(" : ")[0];
            String studentName=command.split(" : ")[1];

            if(!course.containsKey(courseName)){
                course.put(courseName,new ArrayList<>());
                course.get(courseName).add(studentName);
            }else{
                course.get(courseName).add(studentName);
            }
            command=scanner.nextLine();
        }

//        course.entrySet().stream().sorted((e1,e2) ->Integer.compare(e2.getValue().size(),e1.getValue().size()))
//                .forEach(e-> {
//                    System.out.println(e.getKey()+": "+e.getValue().size());
//                    e.getValue().stream().sorted(String::compareTo)
//                    .forEach(student -> System.out.println("-- "+student));
//                });

//        course.entrySet().forEach(e-> {
//            System.out.println(e.getKey()+": "+e.getValue().size());
//            e.getValue().forEach(student -> System.out.println("-- "+student));
//        });

//        for (Map.Entry<String, List<String>> entry : course.entrySet()) {
//            System.out.println(entry.getKey()+": "+entry.getValue().size());
//            entry.getValue().forEach(st-> System.out.println("-- "+st));
//        }
        for (Map.Entry<String, List<String>> entry : course.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue().size());
            entry.getValue().forEach(student-> System.out.println("-- "+student));
        }
        //course.entrySet()--> дай ми мапа с курсовете и искам да ми преминеш през всички записи
        //.forEach --> за всеки един запис --> студент->sout студент (изпринтирай ми всеки един студен който ми е в Листа(value)
        //или forEach вътре описваме какво искаме да се случи с всеки един запис -->entry.getValue.forEach(student-> sout (""student)-->
        //изпринтирай ми всеки един запис,който се съдържа в entry.getValue(това ми е списъка със студентите)



    }
}
