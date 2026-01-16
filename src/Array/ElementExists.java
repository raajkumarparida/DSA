package Array;

public class ElementExists {
    public static void main(String[] args) {

        int[] arr = {1, 9, 7, 3, 4, 6, 8, 2};

        int x = 3;

        boolean found = false;
        int foundIndex = 0;

//        for (int i : arr) {
//            if (x == i) {
//                found = true;
//                break;
//            }
//        }
//        System.out.println(x + "Found at: " + found);

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Found at " + foundIndex);
    }
}
