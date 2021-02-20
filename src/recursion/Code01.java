package recursion;

public class Code01 {



    public static void main(String[] args) {
        int n = 4;
        func(n);
    }

    static void func(int m) {
        // Base case : 적어도 하나의 recurstion에 빠지지 않는 경우가 존재해야한다.
        if (m <= 0)
            return;

        // Recursive case : recursion이 반복하다보면 결국 base case로 수렴해야 한다.
        else {
            System.out.println("Hello World");
            func(m - 1);
        }

    }
}
