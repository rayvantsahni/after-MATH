class Main 
{
    public static int factorial(int n)
    {
        int product = 1;
        for (int i = 1; i <= n; i++)
        {
            product *= i;
        }
        return product;
    }


    public static boolean isStrong(int n)
    {
        int sum = 0, x = n;
        while (n != 0)
        {
            sum += factorial(n % 10);
            n /= 10;
        }
        return (x == sum);
    }


    public static void main(String[] args) 
    {
        int number = 145;
        System.out.println(isStrong(number) ? "Is a Strong Number" : "Is NOT a Strong Number");
    }
}
