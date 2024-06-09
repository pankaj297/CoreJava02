
package Arrays;

public class Marks_three_subject {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 97; //phy
        marks[1] = 95; //chem
        marks[2] = 92; //eng

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }

    }
}