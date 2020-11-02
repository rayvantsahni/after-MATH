import java.util.*;

class Achilles
{
    public static boolean isAchilles(int n) {
        return ((isPowerful(n)) && (!isPerfectPower(n)));
    }


    private static boolean isPerfectPower(int n) {
        if (n == 1)
            return true;

        double root;
        for (int exp = 2; exp * exp <= n; exp++) {
            root = Math.pow(n, 1.0 / exp);
            if (Math.pow(Math.round(root), exp) == n)
                return true;
        }

        return false;
    }


    private static boolean isPowerful(int n) {
        for (Integer p: primeFactorization(n).keySet())
            if (n % (p * p) != 0)
                return false;

        return true;
    }


    private static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>(n);
        boolean[] sieve = new boolean[n + 1];
        sieve[0] = true;
        sieve[1] = true;

        for (int i = 2; i <= n; i++) {
            if (sieve[i])
                continue;
            primes.add(i);

            for (int j = i * i; j <= n; j += i)
                sieve[j] = true;
        }

        return primes;
    }


    private static HashMap<Integer, Integer> primeFactorization(int n) {
        HashMap<Integer, Integer> factorization = new HashMap<>();

        if (n == 1) {
            factorization.put(1, 2);
            return factorization;
        }

        for (Integer prime: getPrimes(n))
            while (n != 1) {
                if (n % prime == 0) {
                    factorization.put(prime, factorization.getOrDefault(prime, 0) + 1);
                    n /= prime;
                }

                else {
                    break;
                }
            }

        return factorization;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int n = scanner.nextInt();

        System.out.println(isAchilles(n) ? "Is Achilles Number" : "Is NOT Achilles Number");
    }
}