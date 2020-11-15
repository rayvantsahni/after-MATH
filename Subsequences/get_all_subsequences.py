def get_subsequences(string):
    if not string:  # checking is the string at hand is an empty string
        return [""]  # returning an empty string

    subsequences = get_subsequences(string[1:])  # passing the string excluding the first character into the function and storing the returned result in a list
    subsequences.extend([string[0] + i for i in subsequences])  # storing the previously returned list elements again in the list but this time prepending the first character to each of the subsequence
    return subsequences


if __name__ == "__main__":
    string = input("Enter string: ")
    print(get_subsequences(string))
