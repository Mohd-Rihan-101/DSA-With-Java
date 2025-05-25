package Functions;

public class factorialNum {

    public static int Factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCofecient(int n, int r){
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nmr_fact = Factorial(n - r);

        int bincoeff = n_fact/ (r_fact * nmr_fact);
        return bincoeff;
    }

    public static void main(String[] args) {
        // System.out.println("Factorial Number is");
        // System.out.println(Factorial(4));

        System.out.println(binCofecient(5, 5));
    }
}
