public class Q1 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        System.out.println("Using For Loop:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println();
        System.out.println("Using Enhanced For Loop:");
        for (int score : scores) {
            System.out.println(score);
        }
        System.out.println();
        System.out.println("Total Students = " + scores.length);
    }
}