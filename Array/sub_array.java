package Array;

public class sub_array {
    public static void subArrayPrint(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.print("Total Sub Array  = " + ts);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArrayPrint(numbers);
    }
}
