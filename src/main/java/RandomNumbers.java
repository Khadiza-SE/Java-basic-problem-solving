import java.util.Random;


public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();



        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;       }


        System.out.println("Generated random numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


        System.out.println();


        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) max = number;


            if (number < min) min = number;
        }


        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
