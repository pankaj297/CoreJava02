
package  Arrays;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //input
        //rows input
        for(int i = 0; i < rows; i++){
//            cols input
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

//        output
//        rows ouput
        for(int i = 0; i < rows; i++){
//            cols ouput
            for(int j = 0; j < cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println( );
        }
    }
}