
package Functions;

import java.awt.*;
import java.util.Scanner;

public class Multiply_Two_Num {
    public static int calculateProduct(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("Products two numbers is : "+ calculateProduct(a, b));
    }
}