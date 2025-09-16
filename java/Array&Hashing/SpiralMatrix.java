import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0; int bottom = matrix.length;
        int left = 0; int right = matrix[0].length;

        while (left < right && top < bottom) {
            // Get every i in the top row
            for (int i = left; i < right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Get every i in the right col
            for (int i = top; i < bottom; i++) {
                res.add(matrix[i][right-1]);
            }
            right--;

            if (left >= right || top >= bottom) {
                break;
            }

            // Get every i in the bottom row
            for (int i = right-1; i >= left; i--) {
                res.add(matrix[bottom-1][i]);
            }
            bottom--;

            // Get every i in the left col
            for (int i = bottom-1; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
