
package Arrays;

import java.util.Scanner;

public class Search_Arrays2D {
    public static void main(String[] args) {

        //Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //input
        //rows
        for(int i = 0; i < rows; i++){
//            cols
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int x = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at locations ( "+ i + ", "+ j + ") ");
                }
            }
        }
    }
}