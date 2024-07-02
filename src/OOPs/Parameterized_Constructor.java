package OOPs;

class Student1{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }

}
public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Pankaj Naik", 21);
        s1.printInfo();
    }
}
