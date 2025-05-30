package AdvancePattern;

public class invertedhalfperamid {

    public static void halfPeramid(int n) {
        for (int i = 1; i <= n; i++) {

            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            // for Print starts
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        halfPeramid(4);
    }
}
