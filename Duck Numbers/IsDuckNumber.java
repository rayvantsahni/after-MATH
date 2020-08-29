import java.util.*;

public class Main 
{
    public static boolean isDuckNumber(String s)
    {
        while (s.startsWith("0"))
        {
            s = s.substring(1);
        }

        return s.contains("0");
    }


    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check for Duck Number");
        String number = scan.nextLine();
        
        System.out.println(isDuckNumber(number) ? "Is a Duck Number" : "Is NOT a Duck Number");
    }
}
