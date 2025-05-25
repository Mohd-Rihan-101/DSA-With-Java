package Functions;

public class fnxOverloading {

    public static int sum(int a, int b){
        return a + b;
    }

      public static int sum(int a, int b, int c){
        return a + b + c;
    }


    public static void main(String[] args) {
        System.out.println("The sum of");
        System.out.println(sum(10, 20));
        System.out.println("The sum of");
        System.out.println(sum(5, 10, 15));
        
    }
}
