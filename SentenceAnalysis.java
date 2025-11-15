public class SentenceAnalysis {
    public static void main(String[] args) {
        String sentence = "Java Programming is FUN and Powerful!";
        int length = sentence.length();
        String lower = sentence.toLowerCase();
        String replaced = sentence.replace(" ", "_");
        boolean hasJava = sentence.contains("Java");
        String funLower = sentence.substring(sentence.indexOf("FUN"),sentence.indexOf("FUN") + 3).toLowerCase();
        System.out.println("Original: " + sentence);
        System.out.println("Character Count: " + length);
        System.out.println("Lowercase: " + lower);
        System.out.println("Spaces replaced: " + replaced);
        System.out.println("Contains 'Java': " + hasJava);
        System.out.println("FUN in lowercase: " + funLower);
    }
}
