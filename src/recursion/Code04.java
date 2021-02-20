package recursion;

import java.util.Scanner;

public class Code04 {

    /**
     * n의 m 승을 구해라
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = power(n, m);
        System.out.println(result);
    }

    static int power(int n, int m) {
        if (m == 0) return 1;
        else {
            return n * power(n, m - 1);
        }
    }
}
