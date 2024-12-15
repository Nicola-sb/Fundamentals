package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song{
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<Song> listSongs=new ArrayList<>();
        for(int i=1 ;i<=n ;i++){
         String[]inputSong=scanner.nextLine().split("_");
         String typeInput=inputSong[0];
         String nameInput=inputSong[1];
         String timeInput=inputSong[2];

         Song currentSong=new Song();
         currentSong.setTypeList(typeInput);
         currentSong.setName(nameInput);
         currentSong.setTime(timeInput);
         listSongs.add(currentSong);
        }
        String lastCommand=scanner.nextLine();
        if(lastCommand.equals("all")){
            for (Song element : listSongs){
                System.out.println(element.getName());
            }
        }else{
            for (Song element:listSongs){
                if(element.getTypeList().equals(lastCommand)){
                    System.out.println(element.getName());
                }
            }
        }
    }
}
