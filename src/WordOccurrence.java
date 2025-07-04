import java.util.HashMap;

public class WordOccurrence {
    public static void main(String[] args) {
        String s = "my name is Shihan";

        // Convert to lowercase (optional, for case-insensitive counting)
        s = s.toLowerCase();

        // Split the string into words
        String[] words = s.split(" ");

        // Create a HashMap to store word occurrences
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // If the word is already in the map, increment its count
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print word occurrences
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }
    }
}