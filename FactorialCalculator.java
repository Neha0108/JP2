public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;  // Predefined number

        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
