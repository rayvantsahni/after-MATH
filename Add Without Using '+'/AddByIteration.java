class Add
{
    public static int add(int x, int y) {
        int sum, carry;

        while (y != 0) {
            carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }

        return x;
    }


    public static void main(String[] args) {
        System.out.println(add(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}