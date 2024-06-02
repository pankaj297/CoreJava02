
package StarPatterns;

public class Inverted_HalfPayramid_roteated_180deg {
    public static void main(String[] args) {

//        inverted Half Pyramid rotated by 180 deg

//              *
//            * *
//          * * *
//        * * * *

        int n = 4;

//        outer loops

        for(int i = 1; i <= n; i++){
//            inner loops -> space print
            for(int j = 1; j <= n-i; j++){
                System.out.print(" \t");
            }

//            second inner loops -> for start print
            for(int j = 1; j <= i; j++){
                System.out.print("* \t");
            }

            System.out.println(" ");
        }
    }

}