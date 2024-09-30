public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        double highest = Double.MIN_VALUE;
        double thirdHighest = Double.MIN_VALUE;


        for (int i = 0; i < cgpas.length; i++) {
            double secondHighest = cgpas[i];
            if (secondHighest > highest) {

                thirdHighest = highest;
                highest = secondHighest;
            }


            else if (secondHighest > thirdHighest && secondHighest < highest) {



                thirdHighest = secondHighest;
            }
        }


        if (thirdHighest == Double.MIN_VALUE) {
            System.out.println("There is no second highest CGPA.");
        } else {
            System.out.println("The second highest CGPA is: " + thirdHighest);
        }


    }
}
