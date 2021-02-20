package recursion;

import java.util.Scanner;

public class Code05 {

    /**
     * Fibonacci Number
     * f(0) = 0
     * f(1) = 1
     * f(n) = f(n-1) + f(n-2)  * n>1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = fibonacci(n);
        System.out.println(result);

    }

    static int fibonacci(int n) {

        if (n < 2) return n;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
}
