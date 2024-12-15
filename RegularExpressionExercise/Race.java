package RegularExpressionExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>racersNames= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        //["George", "Peter", "Bill", "Bill"]

        //ПРавя си в мап в който да си държа състезател-дистанция
        Map<String,Integer> racersDistanse=new LinkedHashMap<>();
        racersNames.forEach(name -> racersDistanse.put(name,0));
        //взимам всяко едно име на състезател -->искам в моя мап да си сложа запис,който срещи това име(name)
        // да ми стои дистанцията-->0
        //По този начин си пълня мапа,като си взимам всяко едно име(name) и му слагам стойността 0

        //Regex
        //Първо си правя регекс за буквите
        String regexLetters="[A-Za-z]+";
        Pattern patternLetters=Pattern.compile(regexLetters);

        String regexDigit="[0-9]";
        Pattern patternDigit=Pattern.compile(regexDigit);

        String input=scanner.nextLine();
        while (!input.equals("end of race")){
            //input-->G4e@55or%6g6!68e!!@
            //Име на състезателя --> само от буквите
            //Щом ще си създавам име на състезатле използвам StringBuilder
            StringBuilder nameBuilder=new StringBuilder();
            Matcher matcherLetter=patternLetters.matcher(input);
            //този матчер ще ми матчва само буквите--> искам да си взема патернаPatternLetters и от него
            //искам да си взема input и така взимам всичките ми текстове,който отговарят на този патерн[А-Za-z]+
            //По този начин си взимам инпута(G4e@55or%6g6!68e!!@) и в него търся всичките ми елементи,който отговаря на регекса(regexLetters)
            //Получавам всички букви от G4e@55or%6g6!68e!!@ --> "G"e"o""r"g"e"
            while (matcherLetter.find()){
                //докато матчера на буквите намира букви-->взимам всяка една буква,която е намера и го залепям
                nameBuilder.append(matcherLetter.group());
            }

            //дистанция на състезателя --> общо от цифрите
            int distanse=0;
            //Създам си още един матчер,който ще ми матча цифрите
            Matcher matcherDigit=patternDigit.matcher(input);//-->така получвам всички цифри под формата на текст ["3","2","5']
            //Сборът от всичките ми цифри ми правя дистанцията
            while (matcherDigit.find()){
                //Докато матчера ми намира цифри трябва да ги добавям към дистанцията--> парсвам ги към int,защото са ми под формата на текст
                distanse=distanse+Integer.parseInt(matcherDigit.group());
                //така взимам всяка една цифра,превръщам я от текст в цяло число и я добавям към дистанцията

                //Трябва да добавя дистанцията на определения съзтезале
                //По условие-->If you receive the same person more than once just add the distance to his old distance.
                //George,0 (първоначалоно всичи са 0) и получавам George,29

                //Създавам си променлива е коята ще държа името на състезателя.Името съм си го създал в StringBuildera
                //и му казвам да ми го преобразувам от SB na String -->toString
                String racerName=nameBuilder.toString();//име на състезателя
                if(racersDistanse.containsKey(racerName)){
                    //По условие-->If you receive the same person more than once just add the distance to his old distance.
                    //Ако в моя речник имам такъв състезател-->взимам му текущата дистанция currentDistances=racerdDistace.get(racrtName);
                    int currentDistance=racersDistanse.get(racerName);
                    //Така си взимам текущата дистанция и после добавям новата
                    racersDistanse.put(racerName,currentDistance+distanse);
                }

            }

            input=scanner.nextLine();
        }
        //състезател-дистанция --> Трябва да изпринтирам кой е на първо място по възходящ ред 50,40,30...
        //Трябва ни списък с първите 3ма състезатели преминали най-голяма дистанция
        //Tрябва да го сортитам така,че най-отгоре да ми стой записа с най-голяма дистанция
        //1во си взимам мапа(racerDistance), 2ro Искам да му взема всички записи(entrySet())
        //3то по тези записи пускам stream()
        //4to с .limit си лимитрам от всички записи да ми останат само първите 3
        //5то на всеки един запис(от първите 3) искам да му взема ключа и съвкупоността от тези ключове да ги направя на списък
        List<String>nameOfFirstThree=racersDistanse.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .map(entry -> entry.getKey())//На всеки запис взимам ключа (име на играча)
                .collect(Collectors.toList());//Получавам списъкот ключовете на първите 3 записа
        //Трябва да ги изпринтирам


        System.out.println("1st place: "+nameOfFirstThree.get(0));
        System.out.println("2nd place: "+nameOfFirstThree.get(1));
        System.out.println("3rd place: "+nameOfFirstThree.get(2));
    }
}
