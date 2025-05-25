package Functions;

public class fact {

    public static int factor(int n) {
        if (n < 0) {
            return -1;
        } else {

        }
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
      int result = factor(4);
      if (result == -1){
        System.out.println("factorial is not define for negative numbers");
      }else{
        System.out.println(result);
      }

    }
}
