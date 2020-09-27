def digital_root(n):
    while len(str(n)) - 1:
        n = sum([int(i) for i in str(n)])
    return n


if __name__ == "__main__":
    n = int(input("Enter number: "))
    print("Digital root is", digital_root(n))