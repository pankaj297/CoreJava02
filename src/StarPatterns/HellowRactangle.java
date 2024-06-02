
package StarPatterns;

public class HellowRactangle {
    public static void main(String[] args) {

//        Hellow Reactangle
//        row -> outer loops
//        cols -> inner loops

//        * 	* 	* 	* 	*
//        * 	 	 	 	*
//        * 	 	 	 	*
//        * 	* 	* 	* 	*

        int n = 4;
        int m = 5;

//        outer loops
        for(int i = 1; i <= n; i++){
//            inner loops
            for(int j = 1; j <= m; j++){
                //cell  -> (i,j)
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("* \t");
                }else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}