
package ConditionalStatements.IfElse;

import java.util.Scanner;

public class equal_greater_less {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

//        if(a == b){
//            System.out.println("Equal");
//        } else {
//            if (a > b) {
//                System.out.println("A is greater than B");
//            } else{
//                System.out.println("A is less than B");
//            }
//        }


        if(a == b){
            System.out.println("Equal");
        } else if (a > b) {
                System.out.println("A is greater than B");
        }
        else{
                System.out.println("A is less than B");
            }
        }

    }


