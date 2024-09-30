import java.util.HashMap; // Import HashMap for counting occurrences

public class CharacterCount {
    public static void main(String[] args) {
        // Input string
        String input = "I live in Dhaka";

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lowercase to ignore case and iterate through each character
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                // Update character count in the HashMap
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the character counts
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
