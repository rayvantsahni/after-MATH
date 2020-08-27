import java.util.*;

class Main 
{
    public static int[][] transpose(int[][] arr)
    {
        int n = arr.length, temp;

        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
            {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        return arr;
    }

    public static void main(String[] args) 
    {
        int[][] a = {{1,2,3}, 
                     {4,5,6}, 
                     {7,8,9}};

        for (int[] array : transpose(a))
            System.out.println(Arrays.toString(array));
    }
}
