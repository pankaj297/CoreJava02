
package Questions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();

        System.out.println("circumference of a circle is : "+ pirntCricle_Circumference(radius));

    }

    public static double pirntCricle_Circumference(double radius){
        final double PI = Math.PI;

        return 2 * PI * radius;

    }
}