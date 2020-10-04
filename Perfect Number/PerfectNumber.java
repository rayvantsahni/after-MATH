import java.io.*;
import java.util.*;

class Main
{
    static String perfectNumber(int n){
        HashSet<Integer> divisors = new HashSet<>();

        divisors.add(1);
        for (int i = 2; i * i < n + 1; i++){
            if (n % i == 0){
                divisors.add(i);
                divisors.add((int) (n / i));
            }
        }

        int sum = 0;
        for (int i: divisors){
            sum += i;
        }

        return sum == n ? "Is a Perfect Number" : "Not a Perfect Number";

    }


    public static void main(String[] args){
        int n = 496;
        System.out.println(perfectNumber(n));
    }
}