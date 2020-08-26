public class Main
{
    
    public static boolean IsAutomorphic(long n)
    {
        String number = String.valueOf(n);
        String square = String.valueOf(n * n);
        
        return square.endsWith(number);
    }
        

     public static void main(String []args)
     {
         
        long number = 890625;
        System.out.println(IsAutomorphic(number) ? "Automorphic" : "NOT Automorphic");
        
     }
}
