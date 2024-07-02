
package OOPs;

 class Student{
    String name;
    int age;
    String course;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.course);

    }
    //Non-parameterized  constructor
//     Student(){
//         System.out.println("Constructor Called");
//     }

     //parameterized  constructor
      Student(String name, int age, String course){
          this.name = name;
          this.age = age;
          this.course = course;
      }
}

public class Demo2 {
    public static void main(String[] args) {
        //parameterized  constructor
        Student s1 = new Student("Pankaj Naik", 21, "BCA");
        s1.printInfo();

        //Non-parameterized  constructor
//        Student s1 = new Student();
//        s1.name = "Pankaj";
//        s1.age = 21;
//        s1.course = "BCA";
//        s1.printInfo();
    }
}
