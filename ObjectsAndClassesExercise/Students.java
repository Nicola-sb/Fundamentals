package ObjectsAndClassesExercise;

import java.util.*;

public class Students {
    static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName,String lastName,double grade){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }
//        public String override;{
//            return this.firstName+this.lastName;
//        }
public String toString() {
    //"{first name} {second name}: {grade
    return String.format("%s %s: %.2f",this.firstName,this.lastName,this.grade);
//    return this.firstName+" "+this.lastName+": "+this.grade;-->така се форматират до първия знак,а ми трябва до втория за да си взема 100/100,иначе съм на 20/100
}


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student>studentList=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
            String currentStudent=scanner.nextLine();//Lakia Eason 3.90
            String firstName=currentStudent.split(" ")[0];//Lakia
            String lastName=currentStudent.split(" ")[1];//Eason
            double grade=Double.parseDouble(currentStudent.split(" ")[2]);//3.90

            Student student=new Student(firstName,lastName,grade);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student:studentList){
            System.out.println(student.toString());
        }
    }
}
