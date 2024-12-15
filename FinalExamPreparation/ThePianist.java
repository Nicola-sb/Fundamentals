package FinalExamPreparation;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Не е решена изцяло:Накрая принтирането с фориййч е грешно.

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<String>>pieceMap=new TreeMap<>();
        //пиеса -> списък с информация([0] -> композитор ,[1] -> key

        for(int i=1 ;i<=n ;i++){
            String []piece=scanner.nextLine().split("\\|");//Fur Elise|Beethoven|A Minor
            //"{piece}|  {composer}|{key}"
            String pieceName=piece[0];
            String composerName=piece[1];
            String keyName=piece[2];
            List<String> pieceInfo=new ArrayList<>();
            pieceInfo.add(composerName);//[0] index
            pieceInfo.add(keyName);//[1] index
            pieceMap.put(pieceName,pieceInfo);
            }

        String command=scanner.nextLine();//Add|Sonata No.2|Chopin|B Minor
        while (!command.equals("Stop")){
            String []commandParts=command.split("\\|");
            String commandName=commandParts[0];

            switch (commandName){
                case "Add":
                    //Add|{piece}|{composer}|{key}":
//You need to add the given piece with the information about it to the other pieces and print:
                    String newPieceName=commandParts[1];
                    String newComposer=commandParts[2];
                    String key=commandParts[3];
                    if(pieceMap.containsKey(newPieceName)){
                        System.out.printf("%s is already in the collection!%n",newPieceName);
                    }else{
                        //ако я няма трябва да я добавя -> трябва да имам име на пиеса и списък с информация
                        List<String>newPieceInfo=new ArrayList<>();
                        newPieceInfo.add(newComposer);
                        newPieceInfo.add(key);
                        pieceMap.put(newPieceName,newPieceInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n",newPieceName,newComposer,key);
                    }
                    break;
                case "Remove":
                    //Remove|{piece}":
                    String pieceName=commandParts[1];
                    //If the piece is in the collection, remove it and print:
                    if(pieceMap.containsKey(pieceName)){
                        pieceMap.remove(pieceName);
                        System.out.printf("Successfully removed %s!%n",pieceName);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceName);
                    }
                    break;
                case "ChangeKey":
                    //ChangeKey|{piece}|{new key}":
                    String pieceNameChangeKey=commandParts[1];
                    String newKey=commandParts[2];
                    //If the piece is in the collection, change its key with the given one and print:
                    //пиеса -> списък с информация
                    //списък с информация -> [{composer},{key}]
                    if(pieceMap.containsKey(pieceNameChangeKey)){
                        List<String>currentPieceInfo=pieceMap.get(pieceNameChangeKey);
                       currentPieceInfo.remove(1);//премахни ми елемента на първи индкес т.е. домоментния ключ
                        currentPieceInfo.add(newKey);
                        pieceMap.put(pieceNameChangeKey,currentPieceInfo);
                        System.out.printf("Changed the key of %s to %s!%n!",pieceNameChangeKey,newKey);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceNameChangeKey);
                    }
                    break;

            }
            command=scanner.nextLine();
        }
        pieceMap.entrySet().stream().sorted((e1,e2)-> {
            if(e1.getKey().compareTo(e2.getKey())==0){
                return e1.getValue().get(0).compareTo(e2.getValue().get(0));
            }
            return e1.getKey().compareTo(e2.getKey());
        }).forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));


        }
    }