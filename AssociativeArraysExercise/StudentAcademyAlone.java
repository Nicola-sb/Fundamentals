package AssociativeArraysExercise;

import java.util.*;

public class StudentAcademyAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>>studentGrade=new LinkedHashMap<>();
        for(int i=1 ;i<=n ;i++){
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            if(!studentGrade.containsKey(name)){
                studentGrade.put(name,new ArrayList<>());
                studentGrade.get(name).add(grade);
            }else{
                studentGrade.get(name).add(grade);
            }
        }


        Map<String,Double>avverrageGradeList=new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentGrade.entrySet()) {
            String studentNameee=entry.getKey();
            List<Double>listGrades=entry.getValue();
            double averrageGrade=getAverrage(listGrades);

            if(averrageGrade >= 4.50){
                avverrageGradeList.put(studentNameee,averrageGrade);
            }
        }

        for (Map.Entry<String, Double> entry : avverrageGradeList.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
        }


    }
    public static double getAverrage(List<Double> listGrades){
        double sum=0;
        for (double grade:listGrades){
            sum=sum+grade;
        }
        return sum / listGrades.size();
    }
}
//  degustationMap.put(guest,new ArrayList<>());
//                degustationMap.get(guest).add(meal);
//            }else{
//                List<String>currentMeal=degustationMap.get(guest);
//                if(!currentMeal.contains(meal)){
//                    currentMeal.add(meal);
//                    degustationMap.put(guest,currentMeal);
//                }
//degustationMap.put(guest,new ArrayList<>());
//                degustationMap.get(guest).add(meal);