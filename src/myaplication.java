public class myaplication {
    public static void main() {
        int[] arr=new int[] {5,2,5,23,23,78,25,89,88};
                int x=minValue(arr);
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


}
