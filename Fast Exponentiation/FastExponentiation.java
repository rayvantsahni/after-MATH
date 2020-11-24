import java.util.*;
import java.text.*;

class Power
{
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0)
            return 1;

        if (exponent % 2 == 0)  // if exponent is even we just return sqaure of (a ^ n/2)
            return calculatePower(base, exponent / 2) * calculatePower(base, exponent / 2);

        else {  // if exponent is odd we just return a * sqaure of (a ^ n/2)
            return calculatePower(base, exponent / 2) * calculatePower(base, exponent / 2) * base;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int n = scanner.nextInt();

        System.out.println(MessageFormat.format("{0}^{1} = {2}", a, n, calculatePower(a, n)));
    }
}