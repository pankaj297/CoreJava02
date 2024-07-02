

package Strings;

import java.util.Scanner;

public class stringmethod {
    public static void main(String[] args) {

      String name1 = "pankaj";
      String name2 = "naik";

      String fullname = name1 + name2;
        System.out.println(fullname.length());

        for(int i = 0; i < fullname.length() ; i++ ){
            System.out.println(fullname.charAt(i));
        }

    }
}