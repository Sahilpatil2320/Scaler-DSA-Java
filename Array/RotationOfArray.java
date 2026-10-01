package Array;

public class RotationOfArray {

    public static int[][] transopse(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    public static void rotation(int[][] arr) {

        int[][] result = transopse(arr);

        // Reverse each row
        for (int i = 0; i < result.length; i++) {

            int j = 0;
            int k = result[i].length - 1;

            while (j < k) {

                int temp = result[i][j];
                result[i][j] = result[i][k];
                result[i][k] = temp;

                j++;
                k--;
            }
        }

        // Print result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Matrix after 90 degree clockwise rotation is:");

        rotation(arr);
    }
}