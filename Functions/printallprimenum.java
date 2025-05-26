package Functions;

public class printallprimenum {

    public static int printAllPrimeNum(int n){
        for(int i=2; i<=n-1; i++){
            if(n % 2 == 0){
                System.out.println(n);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(printAllPrimeNum(10));
    }
}
