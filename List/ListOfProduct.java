package List;

import java.util.*;

public class ListOfProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<String>printProduct=new ArrayList<>();

        for(int i=1 ;i<=n ;i++){
            String currentProduct=scanner.nextLine();

            printProduct.add(currentProduct);
        }

        Collections.sort(printProduct);

        for(int i=0 ;i<n ;i++){
            System.out.printf("%d.%s%n",i+1,printProduct.get(i));
        }
    }
}
