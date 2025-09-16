"""
36. Valid Sudoku
Difficulty: Medium
Topics: Array, Hash Table, Matrix
"""
def isValidSudoku(self, board: list[list[str]]) -> bool:
    # We use 3 sets to keep track of what numbers we’ve already seen:
    row_check = [set() for _ in range(9)]
    col_check = [set() for _ in range(9)]
    box_check = [set() for _ in range(9)]

    for r in range(9):
        for c in range(9):
            if board[r][c] == ".":
                continue
            num = board[r][c]

            # Encode box constraints
            box_key = (r//3) * 3 + (c//3)

            # If any key is already in the set, it's invalid
            if num in row_check[r] or num in col_check[c] or num in box_check[box_key]:
                return False

            # Otherwise, add keys to the set
            row_check[r].add(num)
            col_check[c].add(num)
            box_check[box_key].add(num)

    return True