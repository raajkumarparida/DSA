package Array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 9, 7, 3, 4, 6, 8, 2};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
