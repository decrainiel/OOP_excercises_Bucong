// Imperative Programming Example
// Nag-hatag ta og step-by-step nga instructions

public class Exer1_Imperative {
    public static void main(String[] args) {
        int sum = 0; // magsugod ta sa 0
        int[] numbers = {1, 2, 3, 4, 5};

        // Imperative style: gamit for loop para add tanan numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  // step by step pag-add
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
