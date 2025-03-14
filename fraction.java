public class fraction {
    public static class FractionDetails {
        int num;
        int den;

        // Constructor for FractionDetails
        public FractionDetails(int num, int den) {
            this.num = num;
            this.den = den;
        }
    }

    private FractionDetails fractionDetails;

    public fraction(int num, int den) {
        this.fractionDetails = new FractionDetails(num, den);
        simplify();
    }

    public void simplify() {
        int hcf = gcd(fractionDetails.num, fractionDetails.den);
        fractionDetails.num /= hcf;
        fractionDetails.den /= hcf;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Return GCD
    }

    @Override
    public String toString() {
        return fractionDetails.num + "/" + fractionDetails.den;
    }

    public static void main(String[] args) {
        fraction f1 = new fraction(35, 28);
        System.out.println(f1); // Calls the toString() method
    }
}
