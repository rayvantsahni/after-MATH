from math import floor, sqrt

def get_root(c):
    D = (1 ** 2) - (4 * 1 * c)
    root1 = (-1 + sqrt(D)) / (2 * 1)
    root2 = (-1 - sqrt(D)) / (2 * 1)
    return max(root1, root2)

def is_triangular_number(n):
    root = get_root(n * -2)
    return floor(root) == root

def main():
    n = int(input("Enter number: "))
    print("Is a Triangular Number" if is_triangular_number(n) else "Is NOT a Triangular Number")

if __name__ == "__main__":
    main()