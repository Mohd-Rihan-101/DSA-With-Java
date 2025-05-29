package Functions;

public class sumofdigit {

    public static void sumOfdigit(int n){
        int sum = 0;

        while(n != 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;

            n = n / 10;
        }
        System.out.print( "The Sum of Digits is : " + sum);
    }
    public static void main(String[] args) {
        sumOfdigit(123455104);
    }
}
