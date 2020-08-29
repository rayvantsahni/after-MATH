import java.lang.Math;
import java.util.ArrayList;
import java.util.HashSet;

class Main 
{   
    static HashSet<Integer> numbers = new HashSet<Integer>();

    public static int sumOfSquares(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum += Math.pow((n % 10), 2);
            n /= 10;
        }
        
        return sum;
    }
    
    
    public static boolean isHappy(int n) 
    {          
        while (n != 1)
        {
            if (numbers.contains(n))
                return false;

            numbers.add(n);
            n = sumOfSquares(n);
        }
        
        return true;   
    }


    public static void main(String[] args)
    {
        int n = 13;
        System.out.println(isHappy(n) ? "Is a Happy Number" : "Is NOT a Happy Number");
    }
}
