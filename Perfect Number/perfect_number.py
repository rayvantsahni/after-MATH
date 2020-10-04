import math
n = int(input("Enter a number: "))

divisors = {1}

for i in range(2, math.ceil(n ** .5) + 1):
    if n % i == 0:
        divisors.add(i)
        divisors.add(n // i)

if sum(divisors) == n:
    print("It is a Perfect Number")
else:
    print("NOT a Perfect Number")
