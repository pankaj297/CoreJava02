
package BitManipulation;

//Clear Bit
//Clear the 3rd bit (position = 2) of a number n. (n = 0101)

//Bit Mask : 1 << i
//Operation : And with Not

//ex 1
//i} i << 2
//   0001 << 2
//   0100 <- Bm

//Not perform
//ii]  ~(0100) <- 1011

//And perform
// 1011 & 0101
//  0001


public class ClearBit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}