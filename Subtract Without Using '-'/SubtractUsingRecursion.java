class Subtract
{
    public static int subtract(int x, int y) {
        if (y == 0)
            return x;

        return subtract(x ^ y, (~x & y) << 1);
    }


    public static void main(String[] args) {
        System.out.println(subtract(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}
