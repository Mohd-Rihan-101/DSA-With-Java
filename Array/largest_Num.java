package Array;
import java.util.*;

public class largest_Num {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE; // - infinity

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }

        }

        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 5, 6, 1, 0, 12 };

        System.out.print("The largest number is : " + getLargest(number));
    }
}
