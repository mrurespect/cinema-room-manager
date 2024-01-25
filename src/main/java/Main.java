
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats =sc.nextInt();
        System.out.print("Cinema:\n ");
        for (int i = 0; i <=rows ; i++) {
            if (i == 0) {
                for (int j = 1; j <= seats; j++) System.out.print(" " + j);
                System.out.println();
            } else {
                System.out.print(i);
                for (int j = 0; j < seats; j++) System.out.print(" S");
                System.out.println();
            }
        }
        System.out.println("Enter a row number:");
        int row_number = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat_number =sc.nextInt();
        int price = 10 ;
        if (rows%2==0)if  (row_number>rows/2)price=8 ;
        else if (row_number>(rows/2+1))price=8;
        System.out.println("Ticket price: $"+price);
      /*    int frontHalf,backHalf;
            int income =seats*rows*10;
            if(seats*rows>=60){
            frontHalf =rows/2 *seats ;
            if (rows %2 ==0)backHalf= frontHalf ;
            else backHalf= (rows/2 +1)*seats;
            income = frontHalf*10 +backHalf*8 ;
        }
        System.out.print("Total income:\n$"+income);*/
        System.out.print("Cinema:\n ");
        for (int i = 0; i <=rows ; i++) {
            if (i == 0) {
                for (int j = 1; j <= seats; j++) System.out.print(" " + j);
                System.out.println();
            }
            else if (i== row_number){
                System.out.print(i);
                for (int j = 0; j < seat_number-1; j++) System.out.print(" S");
                System.out.print(" B");
                for (int j = seat_number; j < seats; j++) System.out.print(" S");
                System.out.println();
            }
            else {
                System.out.print(i);
                for (int j = 0; j < seats; j++) System.out.print(" S");

                System.out.println();
            }
        }
}
}