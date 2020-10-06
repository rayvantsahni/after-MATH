def get_primes(n):
    primes = []  # stores the prime numbers within the reange of the number
    sieve = [False] * (n + 1)  # stores boolean values indicating whether a number is prime or not
    sieve[0] = sieve[1] = True  # marking 0 and 1 as not prime

    for i in range(2, n + 1):  # loops over all the numbers to check for prime numbers
        if sieve[i]:  # checks whether a number is not prime
            continue  # skips the loop if the number is not a prime number
        primes.append(i)  # adds a number into list if it is a prime number

        for j in range(i ** 2, n + 1, i):  # loops over all multiples of the prime number starting from the sqaure of the prime number
            sieve[j] = True  # marks the multiple of the prime number as not prime

    return primes  # returns the list containing prime numbers

def get_factorization(n):
    prime_factors = []  # stores the prime factorization of the number

    for prime in get_primes(n):  # looping over all the prime numbers
        while n != 1:  # keeps diving the number by a certain prime number until the number is 1
            if n % prime == 0:  # checks if the number is divisible by a particular prime number
                prime_factors.append(prime)  # add the prime factor in the list if it divides the number
                n /= prime  # reducing the number after dividing it by the prime number
            else:
                break  # if the number is not divisible by the paricular prime number then the inner loop breaks and the number is further divided by the next prime number until the number becomes 1

    return prime_factors  # returns the list containing the prime factorization of the number


if __name__ == "__main__":
    n = int(input("Enter a number: "))
    print(get_factorization(n))