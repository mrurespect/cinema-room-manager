import java.util.*;

public class MatrixDiagonal {
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
            array[i]=Arrays.stream(ligne[i].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int j=0;
        for (int i = 1; i < n; i++){
                if(array[i][i]==array[0][0])continue;
                j++;
            }
        int k=0;
        int diag =array[0][n-1];
        for (int i = 0; i< n; i++) {
            if(array[i][n-i-1]==array[0][n-1])continue;
            k++;
        }
        System.out.println(j);
        System.out.println(k);
        //for (int[] ints : array) System.out.println(Arrays.toString(ints));
        if (j==0 ) System.out.println("YES");
        else System.out.println("NO");

    }
}

