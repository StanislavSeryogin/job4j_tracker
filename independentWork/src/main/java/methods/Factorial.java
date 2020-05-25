package methods;

public class Factorial {
    int factR(int n) { //recurcive method
        int result;

        if (n == 1) return 1;
        result = factR(n - 1) * n;
        return result;
    }
    int factI(int n) { //iterative method
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}
