/*
 * Author: Suki Sahota
 * Description: Fraction OOP Practice
 */
public class Fraction {
    //instance variables
    private int numerator = 0;
    private int denominator = 1;
   
    //constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
   
    //no-arguement constructor
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
   
    //setter
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
   
    //getter
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

    //reduce fraction using gcd method
    public Fraction reduceFraction() {
        int reducedNumerator = numerator / gcd();
        int reducedDenominator = denominator / gcd();
        Fraction reduced = new Fraction(reducedNumerator, reducedDenominator);
        return reduced;
    }
   
    //equals check
    public boolean equals(Fraction otherFraction) {
        return this.denominator == otherFraction.denominator && this.numerator == otherFraction.numerator;
    }
    
    //to string
    public String toString() {
        String s = "";
        s = s + numerator;
        s = s + "/";
        s = s + denominator;
        return s;
    }
}