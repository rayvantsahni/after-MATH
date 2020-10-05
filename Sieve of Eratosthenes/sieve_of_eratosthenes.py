def get_primes(n):
    sieve = [False] * (n-1)  # True -> composite, False -> prime

    for i in range(2, n + 1):  # loops over all the numbers from 2 to n
        if sieve[i - 2]:  # checks if the number has already been marked as composite or not; doing 'i-2' because the loop starts fromm 2 whereas the index of the array starts from 0
            continue  # if the number is already marked True, i.e composite then no need to check it

        for j in range(i ** 2, n + 1, i):  # takes every number marked as False, i.e prime and loops over all of its multiples starting from the square of the number
            sieve[j - 2] = True  # marks all the multiples of the prime number at hand, as True, i.e composite

    return sieve


if __name__ == "__main__":
    n = 100
    for i, j in enumerate(get_primes(n), 2):
        if not j:
            print(i, end = " ")
    print()
