package MidExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeEficientperOurFirst=Integer.parseInt(scanner.nextLine());
        int employeeEficientperOurSecond=Integer.parseInt(scanner.nextLine());
        int employeeEficientperOurThird=Integer.parseInt(scanner.nextLine());

        int studedetnPerHour=employeeEficientperOurFirst+employeeEficientperOurSecond+employeeEficientperOurThird;

        int remainngStudents=Integer.parseInt(scanner.nextLine());

        int timeNeeded=0;

        while (remainngStudents>0){
            timeNeeded++;
            if(timeNeeded % 4 !=0){
                remainngStudents=remainngStudents-studedetnPerHour;
            }
        }
        System.out.printf("Time needed: %dh.",timeNeeded);

    }
}
