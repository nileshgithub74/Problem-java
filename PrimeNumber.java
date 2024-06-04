public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Check if number is less than 2, not prime
        if (number < 2) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, not prime
            }
        }

        return true; // If not divisible, prime
    }

    public static void main(String[] args) {
        // Test the method with some example numbers
        int[] testNumbers = {1, 2, 3, 4, 5, 16, 17, 18, 19, 20};

        for (int num : testNumbers) {
            System.out.println(num + " is prime: " + isPrime(num));
        }
    }
}
