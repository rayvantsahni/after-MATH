import java.util.*;
import java.lang.Math.*;
import java.text.MessageFormat;

class Attractive
{
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


    private static int primeFactorsCount(int n) {
        int count = 0;

        for (Integer prime: getPrimes(n))
            while (n != 1) {
                if (n % prime == 0) {
                    count++;
                    n /= prime;
                }

                else {
                    break;
                }
            }

        return count;
    }


    private static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;

        return true;
    }


    public static boolean isAttractive(int n) {
        return isPrime(primeFactorsCount(n));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Attractive Numbers you would like to see");
        int n = scanner.nextInt();

        int i = 1;
        int count = 0;

        System.out.println(MessageFormat.format("The first {0} Attractive Numbers are -", n));
        while (count < n) {
            if (isAttractive(i)) {
                System.out.print(MessageFormat.format("{0}  ", i));
                count++;
            }

            i++;
        }

        System.out.println();
    }
}