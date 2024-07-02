
package BitManipulation;
//Get Bit
//Get the 3rd bit (position = 2) of a number n. (n = 0101)

//Bit Mask : 1<<i
//Operation : And

//Ex 1
//i]  1 << 2
//   0001 << 2
//   0100 <-  BM
// ii] 0100 AND 0101
 //        0100
//                          non-zero : 1; ✅
//                          zero: 0;


//Ex 2
//i]  1 << 3
//   0001 << 3
//   1000 <-  BM
// ii] 1000 AND 0101
//        1000
//                          non-zero : 1;
//                           zero: 0; ✅

public class GetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;

        int bitMask = 1 << pos;

        if((bitMask & n) == 0){
            System.out.println("Bit was Zero");
        }else {
            System.out.println("Bit was One");
        }
    }
}

