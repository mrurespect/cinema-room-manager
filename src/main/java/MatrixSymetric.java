import java.util.Arrays;
import java.util.Scanner;

public class MatrixSymetric {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt() ;
        scanner.nextLine();
        String []ligne = new String[10];
        for (int i = 0; i < n; i++) {
            ligne[i]=scanner.nextLine();
        }
        int[][]array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i]= Arrays.stream(ligne[i].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int j=0;
        for (int i = 1; i < n; i++){
            if(array[i][j]==array[j][i])continue;
            j++;
        }
        if (j==0 ) System.out.println("YES");
        else System.out.println("NO");
    }
}
