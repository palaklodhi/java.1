public class matrix1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                // top to bottom
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // bottom to top
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}