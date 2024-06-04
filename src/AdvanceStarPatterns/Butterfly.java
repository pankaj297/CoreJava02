
package AdvanceStarPatterns;

public  class Butterfly {
    public static void main(String[] args) {
//        Butterfly


//        *                  *
//        * *              * *
//        * * *          * * *
//        * * * *      * * * *
//        * * * * *  * * * * *
//        * * * * *  * * * * *
//        * * * *      * * * *
//        * * *          * * *
//        * *              * *
//        *                  *
        int n = 5;

        //Upper Half
       for(int i = 1; i <= n; i++){
           for(int j = 1; j <= i; j++){
               System.out.print("*\t");
           }
            //spaces
           int spaces = 2 * (n - i);
           for(int j = 1; j <= spaces; j++){
               System.out.print("\t");
           }

//           second part
           for(int j = 1; j <= i; j++){
               System.out.print("*\t");
           }
           System.out.println(" ");
       }


        //Lower Half
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            //spaces
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }

//           second part
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println(" ");
        }



    }
}