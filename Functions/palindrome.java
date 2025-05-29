package Functions;

public class palindrome {
    public static void palindromeNumber() {
        int num = 1221;
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;

            reverse = reverse * 10 + lastDigit;

            num = num / 10;

        }

        if (original == reverse) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("The Number is not Palindrome");

        }

    }

    public static void main(String[] args) {
        palindromeNumber();
    }
}
