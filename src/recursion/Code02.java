package recursion;

import java.util.Scanner;

public class Code02 {
    
    /**
     *  0 부터 n까지의 합을 구해라
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = func(num);

        System.out.println(result);

    }

    static int func(int n) {
        if (n == 0) return 0;
        else {
            return n + func(n - 1);
        }

    }
}
