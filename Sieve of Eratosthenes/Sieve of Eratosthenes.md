# Sieve of Eratosthenes
A `prime number` is a natural number that has exactly two distinct natural number divisors: the number 1 and itself.

The S-ieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit.
It does so by iteratively marking as composite (i.e., not prime) the multiples of each prime, starting with the first prime number, 2. The multiples of a given prime are generated as a sequence of numbers starting from that prime, with constant difference between them that is equal to that prime.
