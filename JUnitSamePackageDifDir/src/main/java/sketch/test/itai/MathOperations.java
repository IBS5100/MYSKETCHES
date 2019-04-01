package sketch.test.itai;

public class MathOperations {
    //protected MathOperations() {}

    protected static long factorial(int x) {
        if(x < 0) {
            throw new IllegalArgumentException();
        }

        if(x == 0) {
            return 1;
        }

        else {
            return(x * factorial(x - 1));
        }
    }

    protected static double square(double x) {
        return x * x;
    }

    protected static double reciprocal(double x) {
        if(x == 0) {
            throw new IllegalArgumentException();
        }

        return 1 / x;
    }
}
