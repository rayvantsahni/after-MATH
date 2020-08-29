class Main 
{
    public static boolean isDisarium(int m)
    {
        int sum = 0, n = m;
        int length = Integer.toString(n).length();

        while (n != 0)
        {
            sum = sum + (int) Math.pow(n % 10, length--);
            n = n / 10;
        }

        return sum == m;
    }


    public static void main(String[] args) 
    {
        int number = 175;
        System.out.println(isDisarium(number) ? "Is Disarium" : "NOT Disarium");
    }
}
