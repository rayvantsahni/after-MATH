class Add
{
    public static int add(int x, int y) {
        if (y == 0)
            return x;

        return add(x ^ y, (x & y) << 1);
    }


    public static void main(String[] args) {
        System.out.println(add(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}
