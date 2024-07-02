
package BitManipulation;

//Update Bit
//Update the 2nd bit (position = 1) of a number to 1. (n = 0101).

//For 1
//Bit Mask : 1 << i
//Operation : And with Not

// For 0
//Bit Mask : 1 << i
// Operation : OR

// For 0 perform set
//i}  1 << 1
//   0001 << 1
//    0010 <- Bm

//ii] 0010 OR  0101 <- 0111

//For 1 perform clear
//i] i << 2;
//   0001 << 2;
//   0100 <- Bm

//perform not operation
// ~(0100) <- 1011

//perform And operation
//  1011 & 0101
//    0001


import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 : set oper = 0 , clear
        int n = 5; // 0101 -> 0111 ->dec 7
        int pos = 1;

        int bitMask = 1 << pos;
        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            //clear
            int newBitMask = ~(bitMask);
            int newNum = newBitMask & n;
            System.out.println(newNum);
        }
    }
}
