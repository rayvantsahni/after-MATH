class Main 
{
    public static boolean IsBuzzNumber(int n)
    {
        return ((n % 10 == 7) || (n % 7 == 0));
    }


    public static void main(String[] args) 
    {
        int number = 7010307;
        System.out.println(IsBuzzNumber(number));
    }
}
