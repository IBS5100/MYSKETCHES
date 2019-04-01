package sketch.test.itai;

public class MathOperations {
    public MathOperations() {}

    private long factorial(int x) {
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

    private double square(double x) {
        return x * x;
    }

    private double reciprocal(double x) {
        if(x == 0) {
            throw new IllegalArgumentException();
        }

        return 1 / x;
    }
}
