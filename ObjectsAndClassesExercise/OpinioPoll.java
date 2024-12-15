package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinioPoll {
    static class Person{
        //полета
        String name;
        int age;

        //конструктор
        public Person(String name,int age){
            //нов празен обект
            //name=null
            //age=0-->Когато конструктора ми е дефолтен(няма нищо в скобите)
            this.name=name;
            this.age=age;
        }

        //методи
        public String getName(){
            return this.name=name;
        }
        public int getAge(){
            return this.age=age;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person>personList=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
            String personID=scanner.nextLine();
            String name=personID.split(" ")[0];
            int age=Integer.parseInt(personID.split(" ")[1]);

            if(age>30){
                Person person=new Person(name,age);
                personList.add(person);
            }
        }

        for (Person person:personList){
            System.out.println(person.getName()+" - "+ person.getAge());
        }
    }
}
