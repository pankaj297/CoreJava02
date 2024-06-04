
package AdvanceStarPatterns;

public class DiamondPattern {
    public static void main(String[] args) {

      int n = 4;

      for(int i = 1; i <= n;i++){
//          spaces print
          for(int j = 1; j <= n - i; j++){
              System.out.print("\t");
          }

          //star print
//          for(int j = 1; j <= i; j++){
//              System.out.print("*\t");
//          }
//
//          for(int j = 2; j <= i; j++){
//              System.out.print("*\t");
//          }

          //star print second logic
          for(int j = 1; j <= 2 * i - 1; j++){
              System.out.print("*\t");
          }

          System.out.println(" ");
      }


      //lower half
        for(int i = n; i >= 1;i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print("\t");
            }

            //star print
//            for(int j = 1; j <= i; j++){
//                System.out.print("*\t");
//            }
//
//            for(int j = 2; j <= i; j++){
//                System.out.print("*\t");
//            }


            //star print second logic
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*\t");
            }

            System.out.println(" ");
        }


    }
}
