import java.util.Scanner;

class OneDToTwoD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// taking as input dimensions of 2D array
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

		// creating desired 1D and @d array
        int[][] matrix = new int[rows][columns];
        int[] OneDArray = new int[rows * columns];
        int index = 0;

        // Taking Input for 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Copyig the elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                OneDArray[index++] = matrix[i][j];
            }
        }

        
        System.out.println("1D Array:");
        for (int element : OneDArray) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
