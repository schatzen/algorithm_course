package recursion;

import java.util.Scanner;

public class Code06 {

    /**
     * 최애 공약수 : Euclid Method
     * m>=n 인 두 양의 정수 m과 n에 대해서 m이(가) n의 배수이면
     * gcd(m,n)=n이고, 그렇지 않으면 gcd(m,n) = gcd(n,m%n)이다.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = gcd(m, n);
        System.out.println(result);
    }

    static int gcd(int m, int n) {
        // swap m and n
        if (m < n) {
            int tmp = n;
            m = n;
            n = tmp;
        }

        if (m % n == 0) return n;
        else {
            return gcd(n, m % n);
        }
    }
}
