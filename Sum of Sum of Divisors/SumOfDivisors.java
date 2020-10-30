import java.util.*;

class SumOfDivisors
{
    public static int sumOfDivisors(int n) {
        if (n == 1)
            return 1;

        int sum = n + 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                if (i == n / i)
                    continue;
                sum += n / i;
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++)
            sum += sumOfDivisors(i);

        System.out.println(sum);
    }
}
