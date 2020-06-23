number = int(input("which fibonacci term do you want?\n"))

def fib(n):
    # The first and second values will always be fixed
    first = 0
    second = 1

    if n < 1:
        return -1
    if n == 1:
        return first
    if n == 2:
        return second

    count = 3  # Starting from 3 as the first 2 terms are fixed
    while count <= n:
        fib_n = first + second
        first = second
        second = fib_n
        count += 1
    return fib_n

print(fib(number))
