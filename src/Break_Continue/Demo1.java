
package Break_Continue;

public class Demo1 {
    public static void main(String[] args) {
        //BREAK & CONTINUE
        int i = 0;
        while(true){

            if(i == 3){
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if(i > 5){
                break;
            }
        }
    }
}