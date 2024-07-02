
package OOPs.Inheritance;

class Shape2{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle2 extends Shape2{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

class EquilateralTriangle extends Triangle1{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

public class Maltilevel_Inheritance {
    public static void main(String[] args) {

    }
}