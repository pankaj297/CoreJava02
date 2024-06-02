
package StarPatterns;

//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *


//Nested Loops - one loop inside more loops

public class SolidRactangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

//        outer loops
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("* \t");
            }
            System.out.println(" ");
        }
    }
}
