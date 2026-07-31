public class Q4 {
    public Q4() {
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 30};

        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException var3) {
            System.out.println("Index out of bounds!");
        }

    }
}
