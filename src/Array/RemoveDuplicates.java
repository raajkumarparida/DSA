package Array;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 9, 7, 3, 4, 6, 8, 2, 5, 4, 6, 8};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        System.out.println("Array without duplicates: " + set);
    }
}
