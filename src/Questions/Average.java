
package Questions;

import java.util.Scanner;

public class Average {
    public static void printAverage (int num1, int num2, int num3){

        int total = num1 + num2 + num3;
        float avg = total / 3;
        System.out.println("Average of 3 Numbers is : " + avg);
        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        printAverage(num1, num2, num3);
    }
}