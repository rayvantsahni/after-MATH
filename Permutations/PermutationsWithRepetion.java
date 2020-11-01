import java.util.*;

class Permutations
{
    public static void getPermutations(String string, int left, int right) {
        if (left == right)
            System.out.println(string);

        else {
            for (int i = left; i <= right; i++) {
                String swappedString = swap(string, left, i);
                getPermutations(swappedString, left + 1, right);
            }
        }
    }



    public static String swap(String string, int left, int right) {
        char[] charString = string.toCharArray();
        char temp = charString[left];
        charString[left] = charString[right];
        charString[right] = temp;

        return String.valueOf(charString);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string");
        String string = scanner.nextLine();
        int n = string.length() - 1;

        System.out.println("All Permutations of " + string + " are:");
        getPermutations(string, 0, n);
    }
}