import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class exercice  {
        public static void main(String[] args) throws  IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            String[] arr=str.split("");
            int i=0 ;
            for(String ignored :arr)i++;
            int size=i ;
            String[] array= new String[size];
            int j=i-1;
            for(String element:arr){
                array[j]=element;
                j--;
            }
            StringBuilder output = new StringBuilder(array[0]);
            for(i=1;i<size;i++) output.append(array[i]);
            System.out.println(output);
        }
    }
