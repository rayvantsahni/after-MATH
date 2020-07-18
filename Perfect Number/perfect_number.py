import math
n = int(input("Enter a number:\n"))

divisors = []

for i in range(1, math.ceil(n ** .5) + 1):
    if n % i == 0:
        divisors.append(i)
        divisors.append(n // i)
        
if sum(list(set(divisors))) // 2 == n:
    print("It is a Perfect Number")
else:
    print("NOT a Perfect Number")
