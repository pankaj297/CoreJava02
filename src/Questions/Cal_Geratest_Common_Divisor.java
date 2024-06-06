
package Questions;

import java.util.Scanner;

public class Cal_Geratest_Common_Divisor {

    public static int GCD(int x , int y){
        if(y == 0){
            return x;
        }
        return GCD(y, x % y);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num x : ");
        int x = sc.nextInt();

        System.out.print("Enter the second num y : ");
        int y = sc.nextInt();

        int result = GCD(x , y);

        System.out.println("the Greatest Common Divisor of  : "+ x + " and "+ y + " is : "+ result);

        sc.close();

    }
}