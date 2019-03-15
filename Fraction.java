/*
 * Author: Suki Sahota
 * Description: Fraction OOP Practice
 */
public class Fraction {
    // Instance variables
    private int numerator = 0;
    private int denominator = 1;
   
    // Two-argument constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
   
    // No-argument constructor
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
   
    // Setter
    public void setNumerator(int newNumerator) {
        numerator = newNumerator;
    }
   
    public boolean setDenominator(int newDenominator) {
        boolean sucess = true;
        if (newDenominator != 0) {
            denominator = newDenominator;
        } else {
            sucess = false;
        }
        return sucess;
        }
   
    // Getter
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
   
    public double getDoubleFraction() {
        double doubleFraction = (double)(numerator / denominator);
        return doubleFraction;
    }

    public int gcd() {
        int gcd = 0;
        int max = numerator;
        if (denominator < numerator) {
            max = denominator;
        }
        for (int i = 1; i <= max; i++){
            if (numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    // Reduce fraction using gcd method
    public Fraction reduceFraction() {
        int reducedNumerator = numerator / gcd();
        int reducedDenominator = denominator / gcd();
        Fraction reduced = new Fraction(reducedNumerator, reducedDenominator);
        return reduced;
    }
   
    // Equals check
    public boolean equals(Fraction otherFraction) {
        return this.denominator == otherFraction.denominator &&
               this.numerator == otherFraction.numerator;
    }
    
    // To string
    public String toString() {
        String s = "";
        s = s + numerator;
        s = s + "/";
        s = s + denominator;
        return s;
    }
}
