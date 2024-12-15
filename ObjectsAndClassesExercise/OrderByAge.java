package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Order{
        String name;
        String id;
        int age;

        public Order(String name,String id,int age){
            this.name=name;
            this.id=id;
            this.age=age;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
//            return String.format("%s with ID: %s is %d years old.",this.name,this.id,this.age);
//            Stephan with ID: 524244 is 10 years old.
            return this.name+" with ID: "+this.id+" is " + this.age + " years old.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Order>orderList=new ArrayList<>();
        String command=scanner.nextLine();
        while (!command.equals("End")){
            String[] currentInput=command.split(" ");
            String name=currentInput[0];
            String id=currentInput[1];
            int age=Integer.parseInt(currentInput[2]);

            Order order=new Order(name,id,age);
            orderList.add(order);

            command=scanner.nextLine();
        }

        orderList.sort(Comparator.comparing(Order::getAge));
        for(Order order:orderList){
            System.out.println(order.toString());
        }
    }
}
