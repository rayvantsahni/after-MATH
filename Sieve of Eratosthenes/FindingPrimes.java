/*
This is the Sieve of Eratosthenes algorithm,
It is used to find prime numbers.
Complexity is O(n.log(log n))
*/

//import java.util.Scanner;
//import java.util.Arrays;
import java.util.*;

public class Main
{
    static int N;
    static int[] primeArray;

    public static void primeDisplay(int n)
    {
        primeArray = new int[n + 1];

        for (int i = 2; i <= n; i++)
        {
            if (primeArray[i] == 1) continue;
            System.out.print(i + " ");

            for (int j = i * i; j <= n; j += i)
            {
                primeArray[j] = 1;
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int N = scan.nextInt();

        System.out.println("All the Prime Numbers in the range of " + N + " are:");
        primeDisplay(N);

    }
}
