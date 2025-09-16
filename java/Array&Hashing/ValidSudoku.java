import java.util.HashSet;

public class ValidSudoku {
    /**
     * 36. Valid Sudoku
     * Difficulty: Medium
     * Topics: Hash Table, Matrix
     */
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                // Encode box constraints
                int boxIdx = (i / 3) * 3 + (j / 3);

                // If any key is already in the set, it's invalid
                if (rows[i].contains(c) || cols[j].contains(c) || boxes[boxIdx].contains(c)) {
                    return false;
                }

                // Otherwise, add keys to the set
                rows[i].add(c);
                cols[j].add(c);
                boxes[boxIdx].add(c);
            }
        }

        return true;
    }
}
