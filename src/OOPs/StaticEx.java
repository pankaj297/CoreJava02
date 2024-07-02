
package OOPs;

class Students0{
    String name;
   static String school;

   public static void changeSchool(){
       school = "IMRS";
   }

}
public class StaticEx {
    public static void main(String[] args) {
        Students0.school = "IMR";
        Students0 st1 = new Students0();
        st1.name = "Pankaj";
        System.out.println(st1.school);
    }
}