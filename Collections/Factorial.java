package Collections;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(fact(10));
    }

    public static int fact (int n) {

//        if (n == 1) return 1;
//
//        return n * fact(n-1);

        return (n == 1) ? 1 :  n * fact(n - 1);
    }
    //test com
}
