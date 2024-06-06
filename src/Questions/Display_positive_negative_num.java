
package Questions;

import java.awt.*;
import java.util.Scanner;

public class Display_positive_negative_num {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
             int positiveCount = 0;
             int negativeCount = 0;
             int zeroCount = 0;


             String userChoices;

             do{
                 System.out.println("Enter the number : ");
                 int number = sc.nextInt();

                 if(number > 0){
                     positiveCount++;
                 } else if (number < 0) {
                     negativeCount++;
                 }else {
                     zeroCount++;
                 }

                 System.out.print("You want to second number (yes/no) : ");
                 userChoices = sc.next();

             }while (userChoices.equalsIgnoreCase("yes"));

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        sc.close();


    }
}