
package OOPs.Inheritance;



class Shape4{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle4 extends Shape4{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle1 extends Shape4{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class Roundeshape extends Circle1{
    public void area(){
        System.out.println();
    }
}
public class Hybrid_Inheritance {
    public static void main(String[] args) {

    }
}