import java.util.ArrayList;

/**
 * Created by toryang on 16/3/10.
 */
public class PrintMatrixTest {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {

        ArrayList<Integer> lst = new ArrayList<Integer>();
        int i = 0, j = 0;
        int x = matrix.length - 1, y = matrix[0].length - 1;
        while (i <= x && j <= y) {
            lst = add(lst, matrix, i, j, x, y);
            i++;
            j++;
            --x;
            --y;
        }
        return lst;
    }

    public static ArrayList<Integer> add(ArrayList<Integer> lst, int[][] matrix, int i, int j, int x, int y) {
        int a, b;
        for (b = j; b <= y; b++)
            lst.add(matrix[i][b]);
        for (a = i + 1; a < x; a++)
            lst.add(matrix[a][y]);
        for (b = y; b >= j && i != x; b--)
            lst.add(matrix[x][b]);
        for (a = x - 1; a > i && j != y; a--)
            lst.add(matrix[a][j]);
        return lst;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        for (int i : printMatrix(matrix)) {
            System.out.print(i+" ");
        }
    }
}
