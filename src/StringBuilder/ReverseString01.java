
package StringBuilder;

public class ReverseString01 {

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {

        String original = "Hello World";

        String reverse = reverseString(original);

        System.out.println("Original String : " + original);
        System.out.println("Reverse String : " + reverse);

    }
}