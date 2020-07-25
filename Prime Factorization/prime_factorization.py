import math

def prime(n):
    for i in range(2, math.floor(n ** .5) + 1):
        if n % i == 0:
            return False
    return True


def prime_factor(n):
    divisors = []

    for i in range(2, math.floor(n ** .5) + 1):
        if n % i == 0:
            divisors.append(i)
            divisors.append(n // i)
    return list(set(divisors + [n]))
    
    
def get_prime_factors(n):
    prime_factors = []
    
    for j in [i for i in prime_factor(n) if prime(i)]:
        while n != 1:
            if n % j == 0:
                prime_factors.append(j)
                n = n / j
            else:
                break
                
    return prime_factors



print(get_prime_factors(660))
