import java.util.*;
import java.lang.Math.*;

class Main
{
    public static boolean isPowerOfBase(int n, int base) {
        double power = Math.log(n) / Math.log(base);
        return Math.floor(power) == Math.ceil(power);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        System.out.println("Enter base");
        int base = scanner.nextInt();

        System.out.println(isPowerOfBase(number, base));
    }
}