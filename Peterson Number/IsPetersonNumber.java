class Main 
{
    public static int factorial(int n)
    {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }


    public static boolean isPetersonNumber(int x)
    {
        int sum = 0, n = x;

        while (n != 0)
        {
            sum += factorial(n % 10);
            n /= 10;
        }

        return (sum == x);
    }


    public static void main(String[] args) 
    {
        int number = 145;
        System.out.println(isPetersonNumber(number) ? "Is a Peterson Number" : "Is NOT a Peterson Number");
    }
}
