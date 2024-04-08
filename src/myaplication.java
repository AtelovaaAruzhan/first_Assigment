public class myaplication {
    public static void main() {
        int[] arr = new int[]{5, 2, 5, 23, 23, 78, 25, 89, 88};
        int x = pow(arr);
        System.out.println(x);

    }

    public static int minValue(int[] array) {
        int currentMinimum = array[0];
        for (int i : array) {
            if (i < currentMinimum) {
                currentMinimum = i;
            }
        }
        return currentMinimum;
    }

    public static double averageValue(int[] array) {
        int sum = 0;
        int count = 0;

        while (count < array.length) {
            sum += array[count];
            count++;
        }
        return (double) sum / count;
    }

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

}
