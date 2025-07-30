import java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    // Constructor to initialize the matrix
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    // Method to input matrix data
    public void readMatrix(Scanner sc) {
        System.out.println("Enter Elements of " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    public void displayMatrix() {
        for (int[] row : data) {
            for (int val : row) {
                System.out.println(val + "\t");
            }
            System.out.println();
        }
    }

    // Method to Add two matrices
    public static Matrix Add(Matrix A, Matrix B)
            throws Exception {
        if (A.rows != B.rows || A.cols != B.cols) {
               throw new Exception("Matrix addition not possible: Dimensions must match.");
        }

        Matrix result = new Matrix(A.rows, B.cols);

        for (int i = 0; i < A.rows; i++) {
            for (int j = 0; j < B.cols; j++){
                result.data[i][j] = A.data[i][j] + B.data[i][j];
            }
        }
        return result;
    }
}

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // input for first matrix
            System.out.print("Enter rows and columns of first matrix: ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            Matrix A = new Matrix(r1, c1);
            A.readMatrix(sc);

            // Input for second matrix
            System.out.println("Enter rows and columns of second matrix: ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            Matrix B = new Matrix(r2, c2);
            B.readMatrix(sc);

            // Attempt Additioon
            Matrix result = Matrix.Add(A, B);
            System.out.println("Resultant Matrix: ");
            result.displayMatrix();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
