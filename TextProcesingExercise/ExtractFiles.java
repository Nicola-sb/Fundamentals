package TextProcesingExercise;

import java.util.Scanner;

public class ExtractFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path=scanner.nextLine();//C:\Internal\training-internal\Template.pptx
        String[]foldersName=path.split("\\\\");
        //regex e съкращение от REGular Expresion
        //foldersName-->["C:","Internal","training-internal","Template.pptx"]

        String fullFileName=foldersName[foldersName.length-1];
        //Взимам си масива(foldersName) и на последна позиция ми стой пълното име на файла

        String fileName=fullFileName.split("\\.")[0];
        String fileExtension=fullFileName.split("\\.")[1];

        System.out.println("File name: "+fileName);
        System.out.println("File extension: "+fileExtension);

    }
}
