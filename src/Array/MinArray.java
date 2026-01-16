package Array;

public class MinArray {
    public static void main(String[] args) {

        int[] arr = {6, 9, 7, 3, 4, 1, 8, 2};

        int min = arr[0];

        // For Each

//        for (int i : arr) {
//            if (i < min) {
//                min = i;
//            }
//        }
//        System.out.println("Min is :" + min);

        // For Loop

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min is :"+ min);
    }
}
