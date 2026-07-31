public class Q5 {
    public Q5() {
    }
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException var3) {
            System.out.println("String is null!");
        }
    }
}
