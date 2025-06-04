package Array;
// array is a call by reference  with examples
public class arrayBasics {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {79, 95, 100};
        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }

    }
}
