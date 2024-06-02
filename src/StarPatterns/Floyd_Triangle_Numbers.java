
package StarPatterns;

public class Floyd_Triangle_Numbers {
    public static void main(String[] args) {

//        1
//        1  2
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

        int n = 5;
        int num = 1;

//        outer loops
        for(int i = 1; i <=n; i++){
            //inner loops
            for(int j = 1; j <= i; j++){
                System.out.print(num + "\t");
                num++; //num = num + 1;
            }
            System.out.println(" ");
        }
    }
}