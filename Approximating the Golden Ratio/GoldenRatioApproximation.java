//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        double goldenRatio;
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> fiboSeries = new ArrayList<Integer>();
        fiboSeries.add(0);
        fiboSeries.add(1);

        System.out.println("Enter the value of n");
        int n = scan.nextInt();

        for (int i = 2; i <= n; i++)
            fiboSeries.add(fiboSeries.get(i-1) + fiboSeries.get(i-2));

        System.out.println("Fibonacci series till the " + (n+1) + "th term:\n" + fiboSeries);

        goldenRatio = (double)fiboSeries.get(n) / fiboSeries.get(n-1);
        System.out.println("Dividing the " + (n+1) + "th term by the " + n + "th term to get an approximate of the Golden Ratio,");
        System.out.println("i.e,\n" + fiboSeries.get(n) + " / " + fiboSeries.get(n-1));
        System.out.println("Hence, we get: " + goldenRatio);

    }
}
