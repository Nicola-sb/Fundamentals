package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalog {
    static class Catalog{
        String type;
        String model;
        String color;
        int horsePower;


        public Catalog(String type,String model,String color,int horsePower){
            this.type=type;
            this.model=model;
            this.color=color;
            this.horsePower=horsePower;
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalog>catalogList=new ArrayList<>();
        String command=scanner.nextLine();
        while (!command.equals("End")){
            String inputModel=scanner.nextLine();
            String type=inputModel.split(" ")[0];
            String model=inputModel.split(" ")[1];
            String color=inputModel.split(" ")[2];
            int horsePower=Integer.parseInt(inputModel.split(" ")[3]);
            Catalog catalog=new Catalog(type,model,color,horsePower);
            catalogList.add(catalog);


            command=scanner.nextLine();
        }
        String moderOrVehicle=scanner.nextLine();
        switch (moderOrVehicle){

        }

    }
}
