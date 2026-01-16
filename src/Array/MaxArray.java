package Array;

public class MaxArray {
    public static void main(String[] args) {

        int[] arr = {1, 9, 7, 3, 4, 6, 8, 2};
        int max = arr[0];


        // For Each

//        for (int i : arr) {
//            if (i > max) {
//                max = i;
//            }
//        }
//        System.out.println(max);

        // For Loop

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is :" + max);
    }
}
