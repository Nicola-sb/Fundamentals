package MidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCounts=Integer.parseInt(scanner.nextLine());//брои на студентите в курса -> 5
        int lectorsCounts=Integer.parseInt(scanner.nextLine());//брой на лекциите в курса --> 25
        int bonus=Integer.parseInt(scanner.nextLine());// бонус за всеки курс -> 30

        //трябва да намеря бонус точките за всеки студент за определен курс
        //На първия ред получвам броя на студентите за определения курс
        //На втория ред получавам броя на лекциите за определения курс
        //За всеки курс има допълнителен бонус
        //Бонуса ще го получа на третия ред
        //На следващите редове ще получавам броя посещения на всеки ученик

        //бонуса са се намира по следваната формула
        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        //double totalBonus=(studentCounts / lectorsCounts) * (5 + bonus);
        //Да намеря студента с най-голям бонус и да принтирам с броя на неговите посещения
        //"Max Bonus: {maxBonusPoints}."

         double maxBonus=0;
         int maxLectures=0;
        for(int i=1 ;i<=studentCounts ;i++){
            int attendasec=Integer.parseInt(scanner.nextLine());

            double currentBonus=attendasec * 1.0 / lectorsCounts *  (5 + bonus);
            if(currentBonus>maxBonus){
                maxBonus=currentBonus;
                maxLectures=attendasec;
            }
        }


        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",maxLectures);
    }
}
