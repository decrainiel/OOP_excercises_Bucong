// Declarative Programming Example
// Nag-focus ta sa unsa ang gusto buhaton, dili unsaon pag step-by-step

public class Exer1_Declarative {
    public static void main(String[] args) {
        // Simple declarative: pagsulti nga ang formula para factorial
        int number = 5;
        int result = factorial(number);

        System.out.println("Factorial of " + number + " = " + result);
    }

    // Declarative approach: recursive function (klaro ang gusto nga resulta, dili detalyado ang steps)
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1); // recursion
    }
}
