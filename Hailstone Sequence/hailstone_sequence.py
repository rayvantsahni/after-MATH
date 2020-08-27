def hailstone(n):
    while 1:
        print(n)
        if n == 1:
            break
        n = 3*n + 1 if n & 1 else n // 2


if __name__ == "__main__":
    hailstone(int(input("Enter the starting number:\n"))) # try 7 or 27
