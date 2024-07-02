
package OOPs.Abstraction;

interface Animal1{
    void walk();
}

interface Herbivore{

}
 class Horse2 implements Animal1, Herbivore{
   public void walk(){
        System.out.println("walks on 4 legs");
    }
 }
public class AbstractInterface {
    public static void main(String[] args) {
        Horse horse = new Horse();
    }
}