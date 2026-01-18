package Array;

public class IsSorted {
    public static void main(String[] args) {

        int [] arr = {1, 9, 7, 3, 4, 6, 2, 8};
        boolean sorted = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Array sorted: " + sorted);
    }
}
