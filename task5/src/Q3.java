public class Q3 {
    public Q3() {
    }
    public static void main(String[] args) {
        try {
            int result = 15 / 0;
            System.out.println(result);
        } catch (ArithmeticException var2) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
