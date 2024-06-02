
package StarPatterns;

public class HalfPyramid_Numbers {
    public static void main(String[] args) {

        //HalfPyramid_Numbers
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        int n = 5;

//        outer loops
        for(int i = 1; i <= n; i++){
//            inner loops
            for(int j = 1; j <= i; j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}