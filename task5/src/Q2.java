public class Q2 { public Q2() {
    }
    public static void main(String[] args) {
        String text = "   Java is FUN and Java is powerful   ";
        text = text.trim();
        System.out.println(text);
        text = text.toLowerCase();
        System.out.println(text);
        System.out.println(text.contains("java"));
        text = text.replace("java", "Python");
        System.out.println(text);
        String[] words = text.split(" ");
        System.out.println(words[0]);
        System.out.println(words[words.length - 1]);
    }
}