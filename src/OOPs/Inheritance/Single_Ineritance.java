
package OOPs.Inheritance;

class Shape1{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle1 extends Shape1{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

public class Single_Ineritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();

    }
}