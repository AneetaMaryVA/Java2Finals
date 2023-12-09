public class Modulo extends Binary {
    public Modulo(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        int rightValue = right.evaluate();
        if (rightValue != 0) {
            return left.evaluate() % rightValue;
        } else {
            throw new ArithmeticException("You cannot divide by zero!");
        }
    }

    @Override
    public String toString() {
        return left.toString() + " % " + right.toString();
    }
}

