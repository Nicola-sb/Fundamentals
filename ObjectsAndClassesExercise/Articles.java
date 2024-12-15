package ObjectsAndClassesExercise;

import java.util.Scanner;

public class Articles {
    static class Articleesss{
        //Класът задължително има
        //1.характеристики-->полета
        String title;
        String content;
        String author;
        //2.конструктор--->създаваме обекти
        public Articleesss(String title,String content,String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }
        //3.функционалсти-->методи
        public void edit(String newContent){
            this.content=newContent;
        }
        public void changeAuthor(String newAuthor){
            this.author=newAuthor;
        }
        public void rename(String newTitle){
            this.title=newTitle;
        }

        @Override
        //Пренапиша-->да работи по мой избор//"{title}, {content}, {author
        public String toString() {
            //"{title}, {content}, {author}
            return this.title + " - " + this.content + ": " + this.author;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData=scanner.nextLine();
        //"Holy Ghost, content, John Sandford".split(", ")-->
        //["Holy Ghost","content","John Sandfor"]
        String title=articleData.split(", ")[0];//Holly Ghost
        String content=articleData.split(", ")[1];//content
        String author=articleData.split(", ")[2];//John Sandford
        Articleesss articleesss=new Articleesss(title,content,author);
        //създател съл нов обект articlesss със стойности Holly Ghost content John Sandford
        //новият обект искам да го съхраня в променливата articleeess
        //прочел съм първият ред от конзолата и съм си създал статия(articleesss)
        //Write a program that reads an article in the following format "{title}, {content}, {author}"


        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
            //On the next line, you will get a number n. On the next n lines, you will get one of the following commands:
            String command=scanner.nextLine();//ChangeAuthor:  Mitch Albom
            //{име на командата}:-{нова стойност}-->String commandName           String commandValue
            //.split"//: "-->>["{Име на команда}"," {нова стойност}"]
            //"Edit: {new content}";
            //ChangeAuthor: {new author}
            //Rename: {new title}
            String commandName=command.split("\\: ")[0];//Има 3 варианта:Edit,ChangeAuthor,Rename;     ChangeAuthor
            String commandValue=command.split("\\: ")[1];//Mitch Albom
            switch (commandName){
                case "Edit":
                    articleesss.edit(commandValue);
                    //извикай ми метода edit и му подай новата стойност(commandValue) -->Holly Ghost content MitchAlbom
                    break;
                case "ChangeAuthor":
                    articleesss.changeAuthor(commandValue);
                    break;
                case "Rename":
                    articleesss.rename(commandValue);
                    break;
            }
        }

        System.out.println(articleesss.toString());


    }
}
