
public class CurrencyDenominations {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 546;

        System.out.println("Breakdown of amount " + amount + ":");
        for (int note : notes) {

            int count = amount / note;

            if (count > 0) {
                System.out.println(note + " " + count);

                amount -= count * note;
            }
        }
    }
}
