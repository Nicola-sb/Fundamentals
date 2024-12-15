package RegularExpressionExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        String regex="@(?<planetName>[A-Za-z]+)[^@!:,,>-]*:(?<population>[0-9]+)[^@!:,,>-]*!(?<attackTypee>[AD])![^@!:,,>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern=Pattern.compile(regex);
        List<String> attackedPlanet=new ArrayList<>();
        List<String>destroyedPlanet=new ArrayList<>();


        for(int i=1 ;i<=n ;i++){
            String encryptedMessage=scanner.nextLine();//STCDoghudd4=63333$D$0A53333
            String decryptedWord=getDecriptedWod(encryptedMessage);

            Matcher matcher= pattern.matcher(decryptedWord);
            if(matcher.find()){
                String planet= matcher.group("planetName");
                int population=Integer.parseInt(matcher.group("population"));
                String attackType=matcher.group("attackTypee");
                int soldierCount=Integer.parseInt(matcher.group("soldiersCount"));

                if(attackType.equals("A")){
                    attackedPlanet.add(planet);
                }else if(attackType.equals("D")){
                    destroyedPlanet.add(planet);
                }
            }
        }
        System.out.println("Attacked planets: "+attackedPlanet.size());
        //The planets should be ordered by name alphabetically
        Collections.sort(attackedPlanet);
        attackedPlanet.forEach(planet -> System.out.println("-> "+planet));

        System.out.println("Destroyed planets: "+destroyedPlanet.size());
        Collections.sort(destroyedPlanet);
        destroyedPlanet.forEach(planet -> System.out.println("-> "+planet));


    }

    private static String getDecriptedWod(String encryptedMessage) {//целта на метода е да върне декриптираното съобщение
        //Криптираното съобщение-->//STCDoghudd4=63333$D$0A53333   [s, t, a, r] int count ->3 (3 специални букви)
        //1.Първо ни трябва броят на символите [s, t, a, r]
        //To properly decrypt a message, you should count all the letters [s, t, a, r]
        // – case insensitive and remove the count from the current ASCII value of each symbol of the encrypted message.
        int countLetters=getSpecialLettersCount(encryptedMessage);//целта е да върне общия брой на буквите [s, t, a, r]
        //декриптиране-Първо трябва да взема всеки един символ и да го заместя с аскикод на специалните букви
        //дектриптираме-->Конструираме ново съобщение
        StringBuilder decryptedMessage=new StringBuilder();
        //Първота ни стъпка е да обходим всеки един символ от криптираното ни съобщение char symbol:enctyptedMessage.toCharArray
        //Второ създавам си нова променилива char newSymbol->Искаме от аски кода на текущия символ да извадия броя на специалните букви
        //char newSymbol=(char)(symbol-countLetters);
        //Трето: Към декриптирано съобщение си добавяме новия симивол --> decryptedMessage.append(newSymbol)
        //Когото обходя всичките символи в моя СтингБ имам моето декрипитрано съобщение и после трябва да го върна ->return decrytpetMessage
        for (char symbol:encryptedMessage.toCharArray()){
            char newSymbol=(char)(symbol-countLetters);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();
        //Пример А =110,специалните букви ако са ми 3 -->> 110-3 това ми е новият символ
        //1.Взимаме всеки символ от криптираното съобщение
        //2.Трябва да го заменим с новия символ-->ascii на нов символ=асsci на текущ символ - countLetters;
        //3.Добавяме новия символ
    }

    private static int getSpecialLettersCount(String encryptedMessage) {
        //Криптираното съобщение-->//STCDoghudd4=63333$D$0A53333   [s, t, a, r] int count ->3 (3 специални букви)
        int count=0;
        for (char symbol:encryptedMessage.toCharArray()){
            switch (symbol){
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }

}

//Какво научих от задачата?
//1.Сортиране и принтира за всяка планета->
//2.За да обходя всеки един симовл го правя във форийч цикъл като слагам toCharArray
//3.Когата правя нещо със StringBuilder после мога да го върна само като стринг като кажа накрая toString.
//4.В регекса със * звездичка казвам 0 пъти или повече(може да го има или 0 пъти или повече)
