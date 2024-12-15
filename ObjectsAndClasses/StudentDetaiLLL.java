package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetaiLLL {
    static class Student{
    //съсздавам си класа Student,който трябва да има някакви променливи,на който ще задаваме конкретни стойности
        String firstName;
        String lastName;
        String age;
        String town;
        //В момента имам един клас,който има характеристикте firstName,lastName,age,town

        //Създавам си конструктор,който е различен от дефоултния-->public Student() - вътре в скобите трябва да напиша-->
        //(String firstName,String lastName,String age,String town)-това са ми параметри,който ще идват от външния свят
        public Student(String firstName,String lastName,String age,String town){//-това е конструктура в класа Student
            //За да знае констукура,трябва да го именоваме със същото име като класа
           //тук трябва да ги сетна--> this firstName=firstName;
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.town=town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student>studentList=new ArrayList<>();
        String inputLine=scanner.nextLine();
        while (!inputLine.equals("end")){
             String[] currentStudentStats=inputLine.split(" ");
             String firstName=currentStudentStats[0];
             String lasttName=currentStudentStats[1];
             String age=currentStudentStats[2];
             String town=currentStudentStats[3];

             Student currentStudent=new Student(firstName,lasttName,age,town);

             studentList.add(currentStudent);

            inputLine=scanner.nextLine();
        }
        String searchTown=scanner.nextLine();

        for (Student elelemnt:studentList){
            if(elelemnt.getTown().equals(searchTown)){
                System.out.printf("%s %s is %s years old%n",elelemnt.getFirstName(),elelemnt.getLastName(),elelemnt.getAge());
            }
        }
    }
}
