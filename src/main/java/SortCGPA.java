public class SortCGPA {public static void main(String[] args) {
    double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


    for (int i = 0; i < cgpas.length - 1; i++) {
        for (int j = 0; j < cgpas.length - 1 - i; j++) {
            if (cgpas[j] < cgpas[j + 1]) {



                double temp = cgpas[j];
                cgpas[j] = cgpas[j + 1];
                cgpas[j + 1] = temp;
            }
        }
    }


    System.out.println("");
    for (double cgpa : cgpas) {
        System.out.println(cgpa);
    }
}
}
