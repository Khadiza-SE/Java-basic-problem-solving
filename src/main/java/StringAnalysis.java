public class StringAnalysis {
    public static void main(String[] args) {

        String input = "I am a SQA Engineer";


        int wordCount = 0;
        int characterCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        String[] words = input.split(" ");
        wordCount = words.length;


        for (char ch : input.toCharArray()) {

            if (Character.isLetter(ch)) {
                characterCount++;

                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }



        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + characterCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }


    public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
}
