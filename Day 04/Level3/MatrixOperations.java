import java.util.Random;
import java.util.Scanner;

public class MatrixOperations{

    // Method to create a random matrix with specified rows and columns
    public static int[][] generateMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int columnsB = matrixB[0].length;

        if (columnsA != rowsB) {
            throw new IllegalArgumentException("Matrix multiplication is not possible: number of columns of matrixA must be equal to number of rows of matrixB.");
        }

        int[][] resultMatrix = new int[rowsA][columnsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return resultMatrix;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinantOf2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinantOf3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverseOf2x2(int[][] matrix) {
        int determinant = determinantOf2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("The matrix is not invertible.");
        }
        double[][] inverseMatrix = new double[2][2];
        inverseMatrix[0][0] = matrix[1][1] / (double) determinant;
        inverseMatrix[0][1] = -matrix[0][1] / (double) determinant;
        inverseMatrix[1][0] = -matrix[1][0] / (double) determinant;
        inverseMatrix[1][1] = matrix[0][0] / (double) determinant;
        return inverseMatrix;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverseOf3x3(int[][] matrix) {
        int determinant = determinantOf3x3(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("The matrix is not invertible.");
        }

        double[][] adjointMatrix = new double[3][3];
        adjointMatrix[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjointMatrix[0][1] = matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2];
        adjointMatrix[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjointMatrix[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2];
        adjointMatrix[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjointMatrix[1][2] = matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2];
        adjointMatrix[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adjointMatrix[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
        adjointMatrix[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double[][] inverseMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverseMatrix[i][j] = adjointMatrix[i][j] / determinant;
            }
        }
        return inverseMatrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the matrices: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Creating random matrices
        int[][] matrix1 = generateMatrix(rows, columns);
        int[][] matrix2 = generateMatrix(rows, columns);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform operations
        System.out.println("Addition of matrices:");
        int[][] addedMatrix = addMatrices(matrix1, matrix2);
        displayMatrix(addedMatrix);

        System.out.println("Subtraction of matrices:");
        int[][] subtractedMatrix = subtractMatrices(matrix1, matrix2);
        displayMatrix(subtractedMatrix);

        System.out.println("Multiplication of matrices:");
        if (columns == rows) { // Ensure valid multiplication condition
            int[][] multipliedMatrix = multiplyMatrices(matrix1, matrix2);
            displayMatrix(multipliedMatrix);
        }

        System.out.println("Transpose of Matrix 1:");
        int[][] transposedMatrix = transposeMatrix(matrix1);
        displayMatrix(transposedMatrix);

        // Determinant and Inverse calculations for 2x2 and 3x3 matrices
        if (rows == 2 && columns == 2) {
            System.out.println("Determinant of Matrix 1: " + determinantOf2x2(matrix1));
            System.out.println("Inverse of Matrix 1:");
            double[][] inverseMatrix = inverseOf2x2(matrix1);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(inverseMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else if (rows == 3 && columns == 3) {
            System.out.println("Determinant of Matrix 1: " + determinantOf3x3(matrix1));
            System.out.println("Inverse of Matrix 1:");
            double[][] inverseMatrix = inverseOf3x3(matrix1);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(inverseMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    
		sc.close();
	}
}
