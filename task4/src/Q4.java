import java.util.Arrays;
public class Q4 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        int index = Arrays.binarySearch(scores, 90);
        if (index >= 0) {
            System.out.println("Found at index = " + index);
        } else {
            System.out.println("Score Not Found");
        }
    }
}