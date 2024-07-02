
package  BitManipulation;
//Set Bit
//Set the 2nd bit (position = 1) of a number n. (n = 0101)

//Bit Mask : 1<<i
//Operation : OR

//Ex 1
//i]  1 << 1
//   0001 << 1
//   0010 <-  BM
// ii] 0010 AND 0101
//        0111 <- (7)
//                          non-zero : 1; ✅
//                          zero: 0;

public class SetGit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

       int newNum = bitMask | n;
        System.out.println(newNum);
    }
}