from sympy import isprime

def primorial_number_series(n):
    primorial_numbers = [1]  # by definition, primorial(0) = 1

    i = 2  # starting the check for prime numbers from 2
    while len(primorial_numbers) != n:  # the loop runs until we have length of the sequence equal to our requirement
        if isprime(i):  # checks whether a number is prime or not
            primorial_numbers.append(i * primorial_numbers[len(primorial_numbers) - 1])  # the new element in the sequence is obtained by multiplying the current prime number by the product of all previous prime numbers

        i += 1

    return primorial_numbers


if __name__ == "__main__":
    n = int(input("Enter the number of terms of the sequence you want to see: "))

    for i, j in enumerate(primorial_number_series(n)):  # iterating over the sequence of primorial numbers
        print("primorial({}) = {}".format(i, j))