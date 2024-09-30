public class BinarySearchCGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};


        System.out.print("Enter the CGPA you want to search for: ");
        double targetCGPA = new java.util.Scanner(System.in).nextDouble();

        int index = binarySearch(cgpas, targetCGPA);


        if (index == -1) {
            System.out.println("CGPA " + targetCGPA + " is not found in the array.");
        } else {
            System.out.println("CGPA " + targetCGPA + " is found at index: " + index);
        }
    }


    public static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
