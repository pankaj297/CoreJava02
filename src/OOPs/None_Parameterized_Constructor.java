
package OOPs;

class Students{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students(){
        System.out.println("Non-Parameterized Constructor Called");
    }

}

public class None_Parameterized_Constructor {
    public static void main(String[] args) {
        Students s1 = new Students();

        s1.name = "Pankaj Naik";
        s1.age = 21;

        s1.printInfo();
    }
}