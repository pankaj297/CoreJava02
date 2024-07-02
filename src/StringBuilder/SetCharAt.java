
package StringBuilder;

public class SetCharAt {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //set char at index 0 'P'
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}