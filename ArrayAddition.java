import java.util.Scanner;

class ArraySum {
    private int[] A;
    private int[] B;
    private int[] S;

    // Constructor to initialize arrays
    public ArraySum(int size) {
        A = new int[size];
        B = new int[size];
        S = new int[size];
    }

    // Method to input values for A and B
    public void inputArrays() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter elements for Array A:");
            for (int i = 0; i < A.length; i++) {
                A[i] = scanner.nextInt();
            }

            System.out.println("Enter elements for Array B:");
            for (int i = 0; i < B.length; i++) {
                B[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
    }

    // Method to compute S[i] = A[i] + B[i]
    public void computeSum() {
        try {
            for (int i = 0; i < A.length; i++) {
                S[i] = A[i] + B[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size mismatch error!");
        } catch (NullPointerException e) {
            System.out.println("One of the arrays is not initialized.");
        }
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Resultant Array S (A + B):");
        for (int i = 0; i < S.length; i++) {
            System.out.println("S[" + i + "] = " + S[i]);
        }
    }
 
}
    // Main method to run the program
public class ArrayAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the size of arrays: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }

            ArraySum arraySum = new ArraySum(size);
            arraySum.inputArrays();
            arraySum.computeSum();
            arraySum.displayResult();

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
