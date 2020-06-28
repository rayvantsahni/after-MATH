import java.util.*;

public class TowerOfHanoi
{
    static int moves = 0;
    static void towerOfHanoi(int n, String source, String dest, String temp)
    {
        if (n == 1)
        {
            System.out.println("Moving disk " + n + " from " + source + " to " + dest);
            moves++;
        }

        else
        {
            towerOfHanoi(n-1, source, temp, dest);
            System.out.println("Moving disk " + n + " from " + source + " to " + dest);
            moves++;
            towerOfHanoi(n-1, temp, dest, source);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of disks you want");
        int numberOfDisks = scan.nextInt();

        towerOfHanoi(numberOfDisks, "A", "B", "C");
        System.out.println("Solved in " + moves + " moves.");

    }

}
