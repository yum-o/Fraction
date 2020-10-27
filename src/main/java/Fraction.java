public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException(Integer.toString(denominator));
        } else if(denominator < 0) {
            this.numerator *= -1;
            this.denominator = (-1) * denominator;
        } else {
            this.denominator = denominator;
        }
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    public Fraction add(Fraction other){

        return null;
    }

    public Fraction subtract(Fraction other){

        return null;
    }

    public Fraction multiply(Fraction other){

        return null;
    }

    public Fraction divide(Fraction other){

        return null;
    }

    public int fractionResult(){

        return 0;
    }

    private static int greatestCommonDivisor(int num, int den){

        return 0;
    }

    private static int lowestCommonMultiple(int den1, int den2){

        return 0;
    }

}
