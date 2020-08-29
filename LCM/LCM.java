class Main 
{
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }


    public static int lcm(int a, int b)
    {
        if (a == b)
            return a;
        else if (a == 1)
            return b;
        else if (b == 1)
            return a;
        else
            return (a * b) / gcd(a, b);
    }


    public static void main(String[] args) 
    {
        int a = 18, b = 30;
        System.out.println("LCM is " + lcm(a, b));
    }
}
