// Nested expressions
// MAY_DIV_ZERO
// NO_OUT_OF_BOUNDS
// Aline Abler ablera@student.ethz.ch

public class Test3a {
    public static void foo(int i) {
        int x = 1;
        int y = i - 3;
        int z = 3;
        x = x + (y * 8);
        x = (i + 4) / (5 + z);
        x = (i + 4) / (5 + (1 / y));
    }
}
