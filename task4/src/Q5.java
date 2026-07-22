import java.util.Arrays;
public class Q5 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        int[] backupScores = Arrays.copyOf(scores, scores.length);
        System.out.println(Arrays.toString(backupScores));
    }
}