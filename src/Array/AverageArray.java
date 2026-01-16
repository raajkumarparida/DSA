package Array;

public class AverageArray {
    public static void main(String[] args) {

        int[] arr = {1, 9, 7, 3, 4, 6, 8, 2};

        int sum = 0;
        int length = arr.length;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("Sum is : " + sum);
        int avg = sum / length;

        System.out.println(avg);

    }
}
