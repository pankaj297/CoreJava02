
package Questions;

import java.util.Scanner;

public class Sum_odd_num {
    public static void printSum_odd_num(int n){
        int sum = 0;
        for(int i = 1; i <= n; i += 2){
            System.out.print(i + "\t");
            sum += i;

        }
        System.out.println("Sum of odd numbers is : "+ sum);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSum_odd_num(n);
    }
}