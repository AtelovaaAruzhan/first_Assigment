public class myaplication {
    public static void main() {
        int[] arr=new int[] {5,2,5,23,23,78,25,89,88};
                double x=averageValue(arr);
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


}
