
package ConditionalStatements.IfElse;

import java.awt.*;
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        System.out.println("Enter the two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Chose and Enter the type of operation you want to perform (+ , -, / , * , % ");
        char op = sc.next().charAt(0);

        int ans = 0;

        if (op == '+'){
            ans = a + b;
            //addition
        } else if (op == '-') {
            ans = a - b;
            //aubtration
        } else if (op == '/') {
            ans = a / b;
            //division
        }else if (op == '*'){
            ans = a * b;
            // multiplication
        } else if (op == '%') {
            ans = a % b;
        }else {
            System.out.println("Invalid");
        }

        System.out.println("Your ans is "+ ans);
    }

}