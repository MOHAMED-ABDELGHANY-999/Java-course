public class Q2 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("Highest Score = " + max);
        System.out.println("Lowest Score = " + min);
    }
}