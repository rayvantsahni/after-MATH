import java.util.*;

class SelfNumber
{
    public static boolean isSelfNumber(int n) {
        for (int i = 1; i < n; i++)
            if ((sumOfDigits(i) + i) == n)
                return false;

        return true;
    }


    private static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int n = scanner.nextInt();
        System.out.println(isSelfNumber(n) ? "Is a Self Number" : "Is NOT a Self Number");
    }
}