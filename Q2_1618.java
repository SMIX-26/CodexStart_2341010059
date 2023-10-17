/*
 * Name: Samikshya Jena
 * Reg No: 2341010059
 * PS LINK: https://cses.fi/problemset/task/1618
 */
import java.util.Scanner;
public class trailing01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int trailingZeros = countTrailingZeros(n);
        System.out.println(trailingZeros);
        
    }

    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
}

