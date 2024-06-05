
package Questions;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Vote_allow_or_not {
    public static void printVoteAllowOrNot(int age){

        if(age < 0 || age > 100){
            System.out.println("invalid age");
        } else if (age < 18) {
            System.out.println("You Can't Vote ");
        }else {
            System.out.println("You Can Vote This Elections ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

       printVoteAllowOrNot(age);
    }

}