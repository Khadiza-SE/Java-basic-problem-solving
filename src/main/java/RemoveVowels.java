public class RemoveVowels {
    public static void main(String[] args) {
        // Input string
        String input = "I am a SQA Engineer";

        // Call the method to remove vowels
        String result = removeVowels(input);

        // Print the output
        System.out.println("Output: " + result);
    }

    // Method to remove vowels from a string
    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficiency

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is not a vowel
            if (!isVowel(ch)) {
                result.append(ch); // Append the character to the result
            }
        }

        return result.toString(); // Convert StringBuilder to String and return
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Convert to lowercase to make the check case-insensitive
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
