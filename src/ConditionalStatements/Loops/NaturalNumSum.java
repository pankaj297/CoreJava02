package ConditionalStatements.Loops;

import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {
//   Q1] Print the Sum of First n Natural Numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
//        int n = 4;
//        for(int i = 0; i <= n; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        in while

//        int i = 0;
//        while (i<=n){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

//        in do while
         int i = 0;
         do{
             sum = sum + i;
             i++;
         }while (i <= n);

        System.out.println(sum);
    }
}


