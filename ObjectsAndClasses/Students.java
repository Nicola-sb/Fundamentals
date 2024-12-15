package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student{
          String firstName;
          String lastName;
          String ages;
          String town;

          public Student(String firstName,String lastName,String ages,String town){
              this.firstName=firstName;
              this.lastName=lastName;
              this.ages=ages;
              this.town=town;
          }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAges() {
            return this.ages;
        }

        public String getTown() {
            return this.town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> listStudents=new ArrayList<>();
        String input=scanner.nextLine();
        while (!input.equals("end")){
           String[]inputStudent=input.split(" ");
           String firstName=inputStudent[0];
           String lastName=inputStudent[1];
           String ages=inputStudent[2];
           String town=inputStudent[3];

           Student currentStudent=new Student(firstName,lastName,ages,town);
           listStudents.add(currentStudent);

            input=scanner.nextLine();
        }

        String searchingTown=scanner.nextLine();

        for (Student element:listStudents){
            if(element.getTown().equals(searchingTown)){
                System.out.printf("%s %s is %s years old%n",
                        element.getFirstName(),
                        element.getLastName(),
                        element.getAges());
            }
        }

    }
}
