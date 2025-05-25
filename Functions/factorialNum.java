package Functions;

public class factorialNum {

    public static int Factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Factorial Number is");
        System.out.println(Factorial(4));
    }
}
