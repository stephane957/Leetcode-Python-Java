"""
54. Spiral Matrix
Difficulty: Medium
Topics: Array, Matrix, Simulation
"""
def spiralOrder(matrix: list[list[int]]) -> list[int]:
    res = []
    top, bottom = 0, len(matrix) # top boundary and bottom boudary pointer (rows)
    left, right = 0, len(matrix[0])    # left boundary and right boundary pointer (cols)

    while left < right and top < bottom:
        # Get every i in the top row
        for i in range(left, right):
            res.append(matrix[top][i])
        top += 1

        # Get every i in the right col
        for i in range(top, bottom):
            res.append(matrix[i][right-1])
        right -= 1

        if not (left < right and top < bottom): # if the pointers cross in the case of a single row/column matrix
            break 

        #Get every i in the bottom row (going backwards)
        for i in range(right-1, left-1, -1):
            res.append(matrix[bottom-1][i])
        bottom -= 1

        #Get every i in the left col (going upwards)
        for i in range(bottom-1, top-1, -1):
            res.append(matrix[i][left])
        left += 1

    return res
    