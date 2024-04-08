public class myaplication {
    public static void main() {
        int[] arr = new int[]{5, 2, 5, 23, 23, 78, 25, 89, 88};
        int x = gcd(7);
        System.out.println(x);

    }
   // /**
    //     * This method find the lowest digit from an array.
    //     * It uses a for loop.
    //     * Time complexity: O(n), where n array.
    //     * For cycle  which  iterates all array,
    //     * resulting in linear time complexity.
    //     * @param array The array of digits where we have to  find the lowest.
    //     * @return min The lowest number from array
    //     */

    public static int minValue(int[] array) {
        int currentMinimum = array[0];
        for (int i : array) {
            if (i < currentMinimum) {
                currentMinimum = i;
            }
        }
        return currentMinimum;
    }
    // /**
    //     * This code calculates the average of an array by summing
    //     all elements and dividing by the array length
    //     * It uses a for cycle.
    //     * Time complexity: O(n), where n length of array.
    //     * For cycle iterating through the all array then summing everuthing together
    //     * algorithm divides  by length of an array and find average.
    //     * The result is linear time complexity.
    //     * @param array The array of digits and we have to find average.
    //     * @return average The average digit which created from given array.
    //     */

    public static double averageValue(int[] array) {
        int sum = 0;
        int count = 0;

        while (count < array.length) {
            sum += array[count];
            count++;
        }
        return (double) sum / count;
    }
    // /**
    //     * This method find out is the given digit is prime or composite.
    //     * It uses a for cycle.
    //     * Time complexity: O(sqrt(n)), where n is the  number.
    //     * For cycle iterates through digits starting from two until to sqrt(n),
    //     * resulting in square root time complexity.
    //     *
    //     * @param n The given digit n, for which the code find out is it prime.
    //     * @return false if  digit is composite, or true if digit
    //     *  is composite.
    //     */

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    // /**
    //     * This method give the factorial of the input digit.
    //     * It uses recursion.
    //     * Time complexity: O(n), where n is the input number.
    //     * Using recursion, the method multiplies every digit starting from  n till 1 by calling itself with the parameter n - 1.
    //     * The result is linear time complexity.
    //     * @param number The digit which factorial will return.
    //     * @return factorial The factorial of the input digit.
    //     */


    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // /**
    //     * This method return  n-th element in the Fibonacci sequence.
    //     * It uses a recursive approach.
    //     * Time complexity: O(2^n), where n  number.
    //     * The recursive algorithm use itself for each non-base case,
    //     * to find out  in exponential time complexity.
    //     *
    //     * @param n The index of the digit in the Fibonacci sequence
    //     *          to be found.
    //     * @return The input value  in the Fibonacci sequence.
    //     */

    public static int fibonacciSequence(int number) {
        if (number <= 1) {
            return number;
        }

        return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);


    }
    public static int pow(int number, int degree, int result) {
        if (degree == 0) {
            return result;
        }

        return pow(number, degree - 1, result * number);
    }

    public static int pow(int number, int degree) {
        return pow(number, degree, 1);
    }
    public static void reverseSequence(int number) {
        if (number == 0) {
            return;
        }

        reverseSequence(number - 1);
        int value = sc.nextInt();
        System.out.print(value + " ");
    }
    public static boolean isDigit(String s, int index) {
        if (index >= s.length()) {
            return true;
        }
        return Character.isDigit(s.charAt(index)) && isDigit(s, index + 1);
    }
    public static int binomialCoefficient(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        } else if (k > n / 2) {
            return binomialCoefficient(n, n - k);
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }


        return gcd(b, a % b);
    }





}
