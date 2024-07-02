


package StringBuilder;

public class Delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tonny");
        System.out.println(sb);

        //delete the extra n
//        sb.delete(2,3);
//        System.out.println(sb);

        //delete two n
        sb.delete(2,4);
        System.out.println(sb);


    }
}

