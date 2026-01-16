package Array;

public class SumArray {

    public static void main(String[] args) {

        int[] arr = {1, 9, 7, 3, 4, 6, 8, 2};

        int sum = 0;

        // For Each ============

//        for (int i : arr) {
//            sum += i;
//        }
//        System.out.println(sum);

        // For Loop =============

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
