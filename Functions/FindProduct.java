package Functions;

import java.util.Scanner;

public class FindProduct {

    public static int multiplyNum(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int result = multiplyNum(a, b);
        System.out.println(result);

    }
}
