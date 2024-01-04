public class sumjav {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum
        int sum = calculateSum(numbers);

        // Display the result
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to calculate the sum of an array of integers
    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
