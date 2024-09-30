import java.util.Scanner;

public class LowestHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the heights of 10 babies
        int[] heights = new int[10];

        // Input heights from the user
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of baby " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }

        // Initialize the two lowest heights with a high value
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        // Find the two lowest heights
        for (int height : heights) {
            if (height < lowest) {
                secondLowest = lowest;
                lowest = height;
            } else if (height < secondLowest && height != lowest) {
                secondLowest = height;
            }
        }

        // Print the results
        System.out.println("The two lowest heights are: ");
        System.out.println("Lowest height: " + lowest + " cm");
        System.out.println("Second lowest height: " + secondLowest + " cm");

        scanner.close();
    }
}