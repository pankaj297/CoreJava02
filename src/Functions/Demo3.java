
package Functions;

public class Demo3 {
    public static void printJava(){
        System.out.println("Hello Java");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //methods
        printName("Pankaj");
        printName("Akash");
        printSum(1, 6);
    }
}