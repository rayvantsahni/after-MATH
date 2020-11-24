import java.util.*;

class SquareRoot
{
    public static int calculateSqrt(int n) {
        if (n == 1 || n == 0)
            return n;

        int left = 0;
        int right = n / 2;
        int floorValue = 0;  // will store the floor value of the square root which will be returned in cases where the number is not a perfect square

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (middle * middle == n)
                return middle;

            else if (middle * middle < n) {
                left = middle + 1;
                floorValue = middle;
            }

            else {
                right = middle - 1;
            }
        }

        return floorValue;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println(calculateSqrt(n));
    }
}