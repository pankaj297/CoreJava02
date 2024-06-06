
package Questions;

import java.util.Scanner;

public class Num_paower {
    public static double paower(double x, int n){
        return  Math.pow(x, n);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base number (x): ");
        double x = sc.nextDouble();

        System.out.println("Enter the exponent (n): ");
        int n = sc.nextInt();

        double result = paower(x, n);

        System.out.println(x + " raised to the power of " + n + " is: " + result);

        // Close the scanner
        sc.close();

//        12 power of 2 = 12 * 12
//                        = 144
//          12 power of 3 = 12 * 12 * 12
//                          = 144 * 12
//                            = 1728.0


    }
}