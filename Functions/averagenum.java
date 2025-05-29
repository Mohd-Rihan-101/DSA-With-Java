package Functions;

public class averagenum {

    public static void averageNum(int a, int b, int c){
        int sum = a + b + c;

        int result = sum/3;
        System.out.println( "The Average Number is :" + result);
    }
    public static void main(String[] args) {
        averageNum(10, 5, 15);
    }
}
