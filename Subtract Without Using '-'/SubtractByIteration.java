class Subtract
{
    public static int subtract(int x, int y) {
        int carry;

        while (y != 0) {
            carry = ~x & y;
            x = x ^ y;
            y = carry << 1;
        }

        return x;
    }


    public static void main(String[] args) {
        System.out.println(subtract(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}