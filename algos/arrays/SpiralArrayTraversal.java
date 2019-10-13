package learning.algos.arrays;

public class SpiralArrayTraversal {

    private static void printSpiralTraversal(int[][] arr, int rowLength, int columnLength) {

        int top = 0, bottom = rowLength - 1, left = 0, right = columnLength - 1, direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {

                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }

                top++;
                direction = 1;
            } else if (direction == 1) {

                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + " ");
                }

                right--;
                direction = 2;
            } else if (direction == 2) {

                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }

                bottom--;
                direction = 3;
            } else {

                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }

                left++;
                direction = 0;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        printSpiralTraversal(arr, arr.length, arr[0].length);
    }
}
