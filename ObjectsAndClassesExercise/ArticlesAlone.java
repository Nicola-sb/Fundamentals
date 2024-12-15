package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesAlone {
    static class Articles{
        String title;
        String content;
        String author;

        public Articles(String title,String content,String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }
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
        public String toString() {
//            return this.title+" - "+this.content+": "+this.author;
          return   String.format("%s - %s: %s",this.title,this.content,this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine=scanner.nextLine();
        String title=inputLine.split(", ")[0];
        String content=inputLine.split(", ")[1];
        String thisauthor=inputLine.split(", ")[2];

        Articles articles=new Articles(title,content,thisauthor);


        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
            String possibleCommand=scanner.nextLine();
            String myCommand=possibleCommand.split("\\: ")[0];
            String secondValue=possibleCommand.split("\\: ")[1];
            switch (myCommand){
                case "Edit":
                    articles.edit(secondValue);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(secondValue);
                    break;
                case "Rename":
                    articles.rename(secondValue);
                    break;
            }
        }

        System.out.println(articles.toString());

    }
}
