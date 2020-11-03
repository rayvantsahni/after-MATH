def get_permutations(arr, left, right, unique_permutations):
    if left == right:
        unique_permutations.add("".join(arr))
    else:
        for i in range(left, right + 1):
            arr[i], arr[left] = arr[left], arr[i]
            get_permutations(arr, left + 1, right, unique_permutations)
            arr[i], arr[left] = arr[left], arr[i]


if __name__ == "__main__":
    string = input("Enter string\n")
    n = len(string) - 1
    unique_permutations = set()
    
    get_permutations(list(string), 0, n, unique_permutations)
    
    print("All permutations without repetition of '{}' are:".format(string))
    for permutation in unique_permutations:
        print(permutation)