package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input=scanner.nextLine();
        while (!input.equals("end")){
            List<String>command=Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String firstWord=command.get(0);
            int number=0;
            int index=0;
            switch (firstWord){
                case "Add":
                    number=Integer.parseInt(command.get(1));
                    numbersInput.add(number);
                    break;
                case "Remove":
                    number=Integer.parseInt(command.get(1));
                    numbersInput.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    index=Integer.parseInt(command.get(1));
                    numbersInput.remove(index);
                    break;
                case "Insert":
                    number=Integer.parseInt(command.get(1));
                    index=Integer.parseInt(command.get(2));
                    numbersInput.add(index,number);
                    break;
            }
          input=scanner.nextLine();
        }

        System.out.println(numbersInput.toString().replaceAll("[\\[\\],]", ""));

    }
}
