
package HakerRank;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        Given an integer,perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5 , print Not Weird
//        If  is even and in the inclusive range of 6 to 20 , print Weird
//        If  is even and greater than 20, print Not Weird

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 != 0){
            // it is odd number
            System.out.println("Weird");
        }else {
            if( 2 <= n && n <= 5){
                System.out.println("Not Werid");
            } else if (6 <= n && n <= 20) {
                System.out.println("Werid");
            }else if(n > 20) {
                System.out.println("Not Werid");
            }
        }

    }
}