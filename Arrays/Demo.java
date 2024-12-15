package Arrays;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           List<String> someinfo=new ArrayList<>();
           someinfo.add("banica");
           someinfo.add("abracadbrad");
           someinfo.add("qwerty");
        Collections.sort(someinfo);
        System.out.println(someinfo);
    }
}