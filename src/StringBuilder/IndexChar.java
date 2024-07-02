
package StringBuilder;

public class IndexChar {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0 'P'
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}