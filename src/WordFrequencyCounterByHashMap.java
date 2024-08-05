import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class WordFrequencyCounterByHashMap {
    //**********from CHAT GPT************//
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ASUS\\Desktop\\document.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words using space as a delimiter
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Convert word to lowercase to ensure case-insensitive counting
                    word = word.toLowerCase();
                    // Remove any punctuation from the word
                    word = word.replaceAll("[^a-zA-Z0-9]", "");
                    if (!word.isEmpty()) {
                        // Update the word count in the map
                        //Check if the word is not empty and update its count in the HashMap using getOrDefault() method.
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }}}
        } catch (IOException e) {
            e.printStackTrace();
        }
        wordCountMap.forEach((key, value) -> System.out.println(key + ": " + value));
        }

}
