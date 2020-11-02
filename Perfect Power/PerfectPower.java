import java.util.*;

class PerfectPower
{
    public static boolean isPerfectPower(int n) {
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int n = scanner.nextInt();

        System.out.println(isPerfectPower(n) ? "Is a Perfect Power" : "Is NOT a Perfect Power");
    }
}