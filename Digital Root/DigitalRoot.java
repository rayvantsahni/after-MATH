import java.util.*;

class Main
{
    public static int digitalRoot(int n) {
        while (String.valueOf(n).length() > 1) {
            n = sumOfDigits(n);
        }
        return n;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Digital root is " + digitalRoot(number));
    }
}