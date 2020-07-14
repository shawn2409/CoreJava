import java.util.Arrays;

public class LowestDifferenceElementsArray {
    // Returns minimum difference between any pair
    public static void main(String[] args) {

        int[] a = new int[]{4, 9, 1, 32, 33};
        Arrays.sort(a);
        int minDiff = a[1] - a[0];
        for (int i = 2; i != a.length; i++) {
            minDiff = Math.min(minDiff, a[i] - a[i - 1]);
        }
        System.out.println(minDiff);


    }

}
