public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException();
        } else if(denominator < 0) {
            this.numerator *= -1;
            this.denominator = (-1) * denominator;
        } else {
            this.denominator = denominator;
        }
    }

    Fraction add(Fraction other){
        int fracDenominator = lowestCommonMultiple(this.denominator, other.denominator);
        int fracNumerator = ((fracDenominator/ this.denominator) * this.numerator) + ((fracDenominator/ other.denominator) * other.numerator);
        return new Fraction(fracNumerator, fracDenominator);

    }

    Fraction subtract(Fraction other){
        int fracDenominator = lowestCommonMultiple(this.denominator, other.denominator);
        int fracNumerator = ((fracDenominator/ this.denominator) * this.numerator) - ((fracDenominator/ other.denominator) * other.numerator);
        return new Fraction(fracNumerator, fracDenominator);
    }

    Fraction multiply(Fraction other){
        int fracNumerator =  this.numerator * other.numerator;
        int fracDenominator = this.denominator * other.denominator;
        return new Fraction(fracNumerator, fracDenominator);
    }

    Fraction divide(Fraction other){
        if(other.denominator == 0){
            throw new IllegalArgumentException(Integer.toString(denominator));
        }
        int fracNumerator =  this.numerator * other.denominator;
        int fracDenominator = this.denominator * other.numerator;
        return new Fraction(fracNumerator, fracDenominator);
    }

    int fractionResult(){
        return numerator /denominator;
    }

    private static int greatestCommonDivisor(int num, int den){
        if (den == 0) {
            return num;
        }
        return greatestCommonDivisor(den, num % den);
    }

    private static int lowestCommonMultiple(int den1, int den2){
        int numgreatestCommonDivisor = greatestCommonDivisor(den1, den2);
        return (den1 * den2)/ numgreatestCommonDivisor;
    }

}