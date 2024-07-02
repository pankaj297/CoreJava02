
package MiniProject;

import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        //MINI Project

        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number (1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WooHooo! .. Correct Number!!");
                break;
            }else if(userNumber > myNumber){
                System.out.println("Your number is large guess small number");
            }else{
                System.out.println("Your number is small guess a large number");
            }
        }while (userNumber >= 0);

        System.out.print("My number was : " );
        System.out.println(myNumber);
    }
}