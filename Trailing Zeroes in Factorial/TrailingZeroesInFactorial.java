import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = scan.nextInt();

        int count = 0;
        int p = 5;

        while (n / p >= 1)
        {
            count += n / p;
            p *= 5;
        }


        System.out.println("There are " + count + " trailing Zeroes in " + n + "!");
    }
}
