
package HakerRank;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter the Number for table");

        int n = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}