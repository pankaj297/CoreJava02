
package StringBuilder;

public class Insert {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //insert in string char
//        sb.insert(0, 'S');
//        System.out.println(sb);

        sb.insert(2, 'N');
        System.out.println(sb);
    }
}