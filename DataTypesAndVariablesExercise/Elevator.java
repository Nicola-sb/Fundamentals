package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople=Integer.parseInt(scanner.nextLine());
        int capacityOfPerson=Integer.parseInt(scanner.nextLine());

//        int courses=numberOfPeople % capacityOfPerson;
//        int course1= (int) Math.ceil(numberOfPeople * 1.0 / capacityOfPerson);
//
//        System.out.println(course1);

        double courses=Math.ceil(numberOfPeople * 1.0/capacityOfPerson);
        System.out.printf("%.0f",courses);
    }
}
