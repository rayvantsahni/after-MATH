def hailstone(n):
    while 1:
        print(n)
        if n == 1:
            break
        n = n // 2 if n % 2 == 0 else 3*n + 1


if __name__ == "__main__":
    hailstone(int(input("Enter the starting number:\n"))) # try 7 or 27
