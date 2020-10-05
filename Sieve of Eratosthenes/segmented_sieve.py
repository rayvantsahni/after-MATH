def get_primes_in_range(left, right):
    primes = []  # will contain all the prime numbers till the sqrt(right)
    sieve = [False] * math.ceil(math.sqrt(right))  # will hold whether the number is prime or not
    sieve[0] = sieve[1] = True  # marking 0 and 1 as True, denoting they are NOT prime

    sqrt_right = math.ceil(math.sqrt(right))  # holds the sqrt(right)
    for i in range(2, sqrt_right):  # loops from 2 to sqrt(right) to check for prime numbers
        if sieve[i]:  # checks whether a number is already marked as composite
            continue
        primes.append(i)  # if number if False, i.e prime then we add it in the prime list

        for j in range(i ** 2, sqrt_right, i):  # loops over the multiples of the prime number
            sieve[j] = True  # marks all multiples of the prime number as True, i.e NOT prime


    segment = [False] * (right - left + 1)  # will hold whether the numbers in the given range are prime or not

    for prime in primes:  # looping over the all prime numbers (from 2 to sqrt(right))

        '''
        if left <= prime:  # checking if the prime number is greater than or equal to left, i.e within the range of the given numbers
            start = prime ** 2  # assigning the start point as the square of the prime number
        else:  # else here signifies that the prime number is less than left, i.e not in the range of the 2 numbers
            start = math.ceil(left / prime) * prime  # assigning start to the prime's 1st multiple in the range of left to right
        '''
        start = max(math.ceil(left / prime) * prime, prime ** 2)

        for j in range(start, right + 1, prime):  # looping over all multiples of the primme starting from 'start'
            segment[j - left] = True  # marking all multiples of the prime as True, i.e NOT prime

    if left == 1:  # checks if 1 is a part of the range
        segment[0] = True  # marking 1 as True, i.e NOT prime

    return segment


if __name__ == "__main__":
    import math

    low = int(input("Enter the minimum value of the range: "))
    high = int(input("Enter the maximum value of the range: "))

    print("All prime numbers between the inclusive range of {} and {} are:".format(low, high))
    for i, j in enumerate(get_primes_in_range(low, high), low):
        if not j:
            print(i)