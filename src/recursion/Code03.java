package recursion;

import java.util.Scanner;

public class Code03 {

    /**
     * 0 부터 n까지의 곱을 구해라. (Factorial)
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println(result);

    }

    static int factorial(int n) {
        if (n == 0) return 1;
        else {
            return n * factorial(n - 1);
        }
    }
}
