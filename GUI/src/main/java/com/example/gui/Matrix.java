package com.example.gui;
public class Matrix {

    /**
     * Finds the determinant of a 2x2 or 3x3 matrix using the cofactor method
     * @param matrix - n x n matrix used to find the determinant
     * @return - The determinant of the matrix
     */
    public static double det(double[][] matrix){
        if (matrix.length == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        } else if(matrix.length == 3){
            return matrix[0][0] * det(findMinor(matrix, 0, 0, 3)) + (-1) * matrix[0][1] * det(findMinor(matrix, 0, 1, 3)) + matrix[0][2] * det(findMinor(matrix, 0, 2, 3));
        }else{
            return matrix[0][0] * det(findMinor(matrix, 0, 0, 4)) + (-1) * matrix[0][1] * det(findMinor(matrix, 0, 1, 4)) + matrix[0][2] * det(findMinor(matrix, 0, 2, 4)) +  matrix[0][3] * det(findMinor(matrix, 0, 3, 4));
        }
    }

    /**
     * Finds the minor matrix by deleting the specified row and column (indexed starting at 0)
     * @param mat - base matrix size n x n
     * @param r - row to delete
     * @param c - column to delete
     * @return - ret: a matrix size (n-1) x (n-1) without the specified row and column
     */
    public static double[][] findMinor(double[][] mat, int r, int c, int n){
        double[][] ret = new double[n-1][n-1];
        int j = 0;
        int i = 0;
        int k = i;
        int l = j;
        while(i < n) {
            while (j < n) {
                //System.out.println(i + " " + j + " " + k + " " + l);
                if (i != r && j != c) {
                    //System.out.println(i + " " + j + " " + k + " " + l);
                    ret[k][l] = mat[i][j];
                    if (l >= n-2) {
                        k++;
                        l = 0;
                    } else{
                        l++;
                    }
                }
                j++;
            }
            j = 0;
            i++;
        }
        return ret;
    }
}

