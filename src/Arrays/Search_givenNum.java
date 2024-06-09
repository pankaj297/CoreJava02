
package Arrays;

import java.util.Scanner;

public class Search_givenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");

      int size = sc.nextInt();
      int numbers[] = new  int[size];

//      input
      for(int i = 0; i < size; i++){
          numbers[i] = sc.nextInt();
      }

        System.out.println("Enter index you need");
      int x = sc.nextInt();

//      output
      for(int i = 0; i < numbers.length; i++){
          if(numbers[i] == x){
              System.out.print("X found at index : "+ i);
          }
      }
    }
}