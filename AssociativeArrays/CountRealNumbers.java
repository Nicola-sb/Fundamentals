package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList= Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        //8 2 2 8 2
        //2 -> 3
        //8 -> 2
        //В мапа ключовете са уникални


        Map<Double,Integer>countNumbersMap=new TreeMap<>();
        //Създавам си мапа,Double ми презентира ключа,а Integer стойността(колко пъти ми се повторя числото в списъка

        //трябва да интерирам по листа->създавам си foreach циъкл
        //8 2 2 8 2 --> 8цата е нашият ключ и ще добавим като някакъв запис в мапа и после да го броим(всеки път,когато срещна 8 да увеличам)
        for (double currentNum:numbersList){
            Integer currentValue=countNumbersMap.get(currentNum);//държи текущото value на текущия запис//по този начин си взимам value на този ключ(currentNum)
            //чрез метода get достъпваме стойност по даден ключ
            //в референтните типове данни(Integer,Double),за разлика от примитивните може да съхраняваме null стойност
            if(countNumbersMap.containsKey(currentNum)){//Ако в този мап(countNumbersMap) се съдържа ключа(currentNum - 8)
                countNumbersMap.put(currentNum,currentValue+1);//ако съдържа currentNum,искам в мапа да си добавя
            }else{
                countNumbersMap.put(currentNum,1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {
//            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
            DecimalFormat df=new DecimalFormat("0.####");
            System.out.printf("%s -> %d%n",df.format(entry.getKey()),entry.getValue());

        }


    }
}
