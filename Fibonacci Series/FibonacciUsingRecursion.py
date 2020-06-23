number = int(input("which fibonacci term do you want?\n"))

def fib(n):
    if n == 1:
        return 0
    if n == 2:
        return 1
    if n > 2:
        return fib(n - 1) + fib(n - 2)
    
print(fib(number))
