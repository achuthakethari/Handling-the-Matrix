package handlemultiarraymatrix;
// Program to exchange rows and columns of 3X3 Matrix

public class HandleMultiArrayMatrix {

    public static void main(String args[]) {

        int noofRows = 3, noofCols = 4;

        int temp;

        int[][] matrix = new int[][]{{1, 2, 3,4}, {5, 6, 7 , 8}, {9, 10, 11, 12}};

        System.out.println("\nPrinting Matrix Length:" + matrix.length);

        System.out.println("\nPrinting Original Matrix:");
        printMatrix(matrix, noofRows, noofCols);

        // Swap 1st row and 3rd row
        // then swap 1st Column and 3rd Column

      /*  System.out.println("\nfirst row and last row swapped");

        for (int i = 0; i < noofCols; i++) {
            temp = matrix[0][i];
            matrix[0][i] = matrix[noofRows - 1][i];
            matrix[noofRows - 1][i] = temp;
        }*/

//        printMatrix(matrix, noofRows, noofCols);

       /* System.out.println("first column and last column swapped");

        for (int i = 0; i < noofRows; i++) {
            temp = matrix[i][0];
            matrix[i][0] = matrix[i][noofCols - 1];
            matrix[i][noofCols - 1] = temp;
        }*/

       // printMatrix(matrix, noofRows, noofCols);

        //System.out.println("\nPrinting Swapped Matrix:");
        //printMatrix(matrix, noofRows, noofCols);
    }


    /*
     * Prints the matrix in row and column wise.
     *
     * @param arr
     *            - Pass the Multi dimensional array
     * @param noofRows
     *            - Pass the no of rows of the Matrix
     * @param noofCols
     *            - Pass the no of cols of the Matrix
     *
     */

    public static void printMatrix(int[][] arr, int noofRows, int noofCols) {
        for (int i = 0; i < noofRows; i++) {
            for (int j = 0; j < noofCols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}