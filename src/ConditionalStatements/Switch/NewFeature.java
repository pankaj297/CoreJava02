
package ConditionalStatements.Switch;

import java.util.Scanner;

public class NewFeature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        switch(button){
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("invalid");
        }

    }
}
