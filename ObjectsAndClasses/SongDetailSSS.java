package ObjectsAndClasses;

import java.util.*;

public class SongDetailSSS {
    //1-създавме си Клас - Сонг--> класът е static за да може после да бъде извикан в мейн методът
    static class Song{
        //след съставенето на класър Сонг-->той има три харектеристика String type,String name,String time
        //след като си създам променливите не задавам стойности;
        String typeList;
        String name;
        String time;
        //след това трябва да си създам Конструктор
        //Song currentSong = new Song()---> Song() e koнструктура
        //Ако не си създам отделен констуктур ще имам defaulten празен
        //Конструктура го извиквам с името на класа-->Song ->> Song _name_ = new Song();

        //Трябва да направя гетъри и сетъри за да мога да достъпвам  тези данни и да ги манипулирам
        //За да мога аз да си създам обект от класа Song и да му задам,че той има конкретен typeList,name,time

        //Трябва да направя метод на който да присвоя някаква стойност,която идва отвън-->public void(трябва да е
        //public,зашото ще го достъпвам от външния свят
        //1.public void setTypelist
        //2.public void setname
        //3.public void settime


        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }//този метод е сетър на typeList
        //Когато извикам методът setTypeList на обекта,който съм си създал във външния свят(Song currentSong=new Song()
        //ше мога на текущия метод да му сетна стойност String typeList т.е. вече ще си има стойност
        //currentSong.setTypelist("Unvisible"-->този обект вече си има някаква конкретна стойност

        public String getTypeList() {
            return typeList;
        }

        public void setName(String name) {
            this.name = name;
         //this означава за  този клас в който се намирам да досъпява променливата String name;
         //второто name,което няма this пред себе си идва от външния свят(тове,което ще поодам като аргумент извиквайки този метод)
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
        List<Song>listSongs=new ArrayList<>();
        for(int i=1 ;i<=n ;i++){
            String[]inputSong=scanner.nextLine().split("_");//favourite_DownTown_3:14
            String typeInput=inputSong[0];//favourite
            String nameInput=inputSong[1];//DownTown
            String timeInput=inputSong[2];//3:14
            //Имем вече type,name i time
            //Трябва да си създаме тези песни,но те са няколко
            //Създавам си List в който да ги съхранявам->името на Листа е List<Song>(като името на класа) _name_

            //Трябва да си създам обекта от класа Song,който ще държи конкретната песен-->currentSong --> това ми е обекта,който държи конкретната шесем

            Song currentSong=new Song();
            currentSong.setTypeList(typeInput);
            //На текущата песен сетвам TypeList от това,което съм прочел от конзолата(String typeInput);
            currentSong.setName(nameInput);
            currentSong.setTime(timeInput);
            //Вече обекта currentSong има конкретните стойност-->favourite Downtown 3:14

            //Мога да добавя текущата currentSong към Листа с песни (listSong);
            listSongs.add(currentSong);
        }
        String command=scanner.nextLine();
        if(command.equals("all")){
            for (Song element:listSongs){
                System.out.println(element.getName());
            }
        }else {
                for (Song element:listSongs){
                    if(element.getTypeList().equals(command)){
                        System.out.println(element.getName());
                    }
                }

        }
    }
}
