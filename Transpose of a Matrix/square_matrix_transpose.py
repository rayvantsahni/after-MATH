def transpose(arr):
    n = len(arr)
    for i in range(n):
        for j in range(i, n):
            arr[i][j], arr[j][i] = arr[j][i], arr[i][j]
    return arr


if __name__ == "__main__":
    a = [[1,2,3],
         [4,5,6],
         [7,8,9]]

    for i in transpose(a):
        print(i)
