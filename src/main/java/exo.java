import java.util.*;
import java.io.*;
public class exo {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt() ;
        scanner.nextLine();
        String ligne2 = scanner.nextLine();
        int n =scanner.nextInt() ;
        int[]array= Arrays.stream(ligne2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int i:array) {
            if (i>n)sum+=i ;
        }
        System.out.println(size);
        System.out.println("x:"+ Arrays.toString(array));
        System.out.println(n);
        System.out.println(sum);




    }
}