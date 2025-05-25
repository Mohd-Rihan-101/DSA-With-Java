package Functions;

import java.util.Scanner;

public class CalculateSum {
    public static int CalculateSum(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        // int sum = CalculateSum(a, b);
        // System.out.println(sum);
        System.out.println("Total of number");
        System.out.println(CalculateSum(a, b));
    }
}
