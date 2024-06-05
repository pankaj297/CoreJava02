
package Questions;

import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        printGreater_number(a,b);
        System.out.println("The greater number between : " + a + " and "+ b + " is : " + printGreater_number(a,b));

    }

    public static int printGreater_number(int a, int b){

        if(a > b){
//            System.out.println("Greater of those two Number " + a);
            return a;
        }else {
//            System.out.println("Greater of those two Number "+ b);
            return b;
        }

    }
}