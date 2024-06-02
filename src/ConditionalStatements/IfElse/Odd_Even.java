package ConditionalStatements.IfElse;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("This is Even Number");
        }else {
            System.out.println("This is Odd Number");
        }
    }
}