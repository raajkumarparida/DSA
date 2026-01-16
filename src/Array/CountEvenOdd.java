package Array;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 9, 7, 3, 4, 6, 8, 2, 5};
        int even = 0, odd = 0;

//        for (int i : arr) {
//            if (i % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//        System.out.println("Total odd = " + odd + " and even is " + even);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even " + even + " Odd " + odd);
    }
}
