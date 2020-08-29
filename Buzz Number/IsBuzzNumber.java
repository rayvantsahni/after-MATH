class Main 
{
    public static boolean isBuzzNumber(int n)
    {
        return ((n % 10 == 7) || (n % 7 == 0));
    }


    public static void main(String[] args) 
    {
        int number = 7010307;
        System.out.println(isBuzzNumber(number) ? "Is a Buzz Number" : "Is NOT a Buzz Number");
    }
}
