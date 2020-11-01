def get_permutations(arr, left, right):
    if left == right:
        print("".join(arr))
    else:
        for i in range(left, right + 1):
            arr[i], arr[left] = arr[left], arr[i]
            get_permutations(arr, left + 1, right)
            arr[i], arr[left] = arr[left], arr[i]


if __name__ == "__main__":
    string = input("Enter string\n")
    n = len(string) - 1
    print("All permutations of '{}' are:".format(string))
    get_permutations(list(string), 0, n)