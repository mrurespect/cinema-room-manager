import java.util.*;
public class tryy {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] array=input.split(" ");
            int x1=convert(array[0]);
            int y1=convert(array[1]);
            int z1=convert(array[2]);
            int x2=scanner.nextInt();
            int y2=scanner.nextInt();
            int z2=scanner.nextInt();
            int max1= x1>y1 ?(Math.max(x1, z1)):(Math.max(y1, z1));
            int max2= x2>y2 ?(Math.max(x2, z2)):(Math.max(y2, z2));
            int min1= x1<y1 ?(Math.min(x1, z1)):(Math.min(y1, z1));
            int min2= x2<y2 ?(Math.min(x2, z2)):(Math.min(y2, z2));
            int[]array1={x1,y1,z1};
            int mid1 = 0;
            for (int i :array1) {
                if (i!=max1 && i!= min1){
                    mid1=i;
                    break;
                }
            }
            int[]array2={x2,y2,z2};
            int mid2 = 0;
            for (int i :array2) {
                if (i!=max2 && i!= min2){
                    mid2=i;
                    break;
                }
            }
            if(max1>max2 && min1>min2 && mid1 >mid2) System.out.println("Box 1 > Box 2");
            else if (max1<max2 && min1<min2 && mid1 <mid2) System.out.println("Box 1 < Box 2");
            else System.out.println("Incompatible");
        }
    public static int convert(String str){
            int val=0;
            try{
                val=Integer.parseInt(str);
            }
            catch(NumberFormatException e){
                System.out.println("invalid String");
            }
            return val ;
        }
    }

