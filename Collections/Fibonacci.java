package Collections;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(fibo(i));
        }
    }

    public static int fibo (int n) {
        if (n == 2 || n == 1) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
