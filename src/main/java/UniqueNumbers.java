import java.util.HashMap; // Import HashMap for counting occurrences

public class UniqueNumbers {
    public static void main(String[] args) {
        // Given array of numbers
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};

        // Create a HashMap to store the counts of each number
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each number
        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        // Print the numbers that are not duplicates
        System.out.print("Unique numbers: ");
        for (int number : countMap.keySet()) {
            if (countMap.get(number) == 1) { // Check if count is 1
                System.out.print(number + " "); // Print unique number
            }
        }
    }
}
