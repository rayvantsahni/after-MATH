def rotate(matrix, n, d):
    while n:
        matrix = rotate_90_clockwise(matrix) if d else rotate_90_counter_clockwise(matrix)
        n -= 1

    return matrix


def rotate_90_counter_clockwise(matrix):
    """
    The function rotates any square matrix by 90° counter clock-wise.
    """
    for row in matrix:
        row.reverse()

    n = len(matrix)
    for row in range(n):
        for col in range(row, n):
            matrix[row][col], matrix[col][row] = matrix[col][row], matrix[row][col]
    return matrix


def rotate_90_clockwise(matrix):
    """
    The function rotates any square matrix by 90° clock-wise.
    """
    n = len(matrix)
    for row in range(n):
        for col in range(row, n):
            matrix[row][col], matrix[col][row] = matrix[col][row], matrix[row][col]

    for row in matrix:
        row.reverse()
    return matrix


if __name__ == "__main__":

    # matrix_1 = [[1]]

    # matrix_2 = [[1, 2],
    #             [3, 4]]

    matrix_3 = [[1, 2, 3],
                [4, 5, 6],
                [7, 8, 9]]

    # matrix_4 = [[1, 2, 3, 4],
    #             [5, 6, 7, 8],
    #             [9, 10, 11, 12],
    #             [13, 14, 15, 16]]


    r = int(input("Enter the number of times you want to rotate the matrix:\n"))
    print("To rotate COUNTER-CLOCKWISE enter 0, OR\nTo rotate CLOCKWISE enter 1.")
    d = int(input())

    print("Rotated Matrix:")
    for row in (rotate(matrix_3, r % 4, d % 2)):
        print(row)
