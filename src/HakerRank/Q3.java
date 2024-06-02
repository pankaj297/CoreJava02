package HakerRank;

import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        // Loop to read input and print formatted output
        for (int i = 0; i < 3; i++) {
            // Read language and score
            String language = scanner.next();
            int score = scanner.nextInt();

            // Format and print the output
            System.out.printf("%-15s%03d%n", language, score);
        }

        System.out.println("================================");

        scanner.close();

    }
}
