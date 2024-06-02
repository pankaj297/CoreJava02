
package StarPatterns;

public class HalfPyramid {
    public static void main(String[] args) {

//        HalfPyramid
//        *
//        * *
//        * * *
//        * * * *

        int n = 4;
//        outer loops
        for(int i = 1; i <= n; i++){
//            inner loops
            for(int j = 1; j <= i; j++){
                System.out.print("* \t");
            }
            System.out.println(" ");
        }

    }
}