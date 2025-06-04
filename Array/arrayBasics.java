package Array;

// array is a call by reference  with examples
public class arrayBasics {

    // yha sirf mene changes kiye hai print nhi kraye hai
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 95, 98, 99 };
        update(marks);
     
        // yha mene print kraya hai apne array ko 
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}
