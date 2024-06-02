
package HakerRank;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scn = new Scanner(System.in);
        // Read integer input
        int i = scn.nextInt();
        // Read Double input
        double d = scn.nextDouble();

        // Consume the remaining newline left-over after reading double
        scn.nextLine(); // Consume the remaining newline

        // Read the remaining input as a string
        String s = scn.nextLine();

        scn.close(); // Close the scanner


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}