import java.util.*;

class PrimeFactorization
{
    private static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();

        boolean[] sieve = new boolean[n + 1];
        sieve[0] = sieve[1] = true;

        for (int i = 2; i <= n; i++) {
            if (sieve[i] == true)
                continue;
            primes.add(i);

            for (int j = i * i; j <= n; j += i) {
                sieve[j] = true;
            }
        }

        return primes;
    }


    public static ArrayList<Integer> factorization(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (Integer prime: getPrimes(n))
            while (n != 1) {
                if (n % prime == 0) {
                    primeFactors.add(prime);
                    n /= prime;
                }

                else {
                    break;
                }
            }

        return primeFactors;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int n = scanner.nextInt();

        System.out.println(factorization(n));
    }
}