package StarPatterns;

public class Triangle_Zero_And_One {
    public static void main(String[] args) {

        int n = 5;

//        outer loop
        for(int i = 1; i<= n; i++){
            for(int j =1; j <= i; j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1\t");
                }else {
                    System.out.print("0\t");
                }

            }
            System.out.println();
        }
    }
}