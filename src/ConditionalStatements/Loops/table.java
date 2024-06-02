
package ConditionalStatements.Loops;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
//        Q1] Print the table of a number input by the user
//        int tableof = 10;
//        int table = 0;
//        for(int i = 1; i <= 10; i++){
//            table = tableof * i;
//            System.out.println(table);
//
//        }

        Scanner sc = new Scanner(System.in);
        int tableof = sc.nextInt();

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i * tableof);
//        }

//        int while
//        int i = 1;
//        while (i <= 10){
//            System.out.println(i * tableof);
//            i++;
//        }

//        in do while
          int i = 1;
         do {
             System.out.println(i * tableof);
             i++;
         }while (i <= 10);
    }
}