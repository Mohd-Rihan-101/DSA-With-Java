package Functions;

public class oddEven {

    public static boolean evenOdd(int n){
        if(n % 2 == 0){
            System.out.println("Number is Even");
            return true;
        }else{
            System.out.println("Number is odd");
          return false;
        }
    
    }
    public static void main(String[] args) {
        System.out.println(evenOdd(0));
    }
}
