class Tribonacci
{
    public static int tribonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        if (n == 2)
            return 1;

        int[] tribo = new int[n + 1];

        tribo[0] = 0;
        tribo[1] = 1;
        tribo[2] = 1;

        for (int i = 3; i <= n; i++)
            tribo[i] = tribo[i - 1] + tribo[i - 2] + tribo[i - 3];

        return tribo[n];
    }


    public static void main(String[] args) {
        System.out.println(tribonacci(1));
    }
}