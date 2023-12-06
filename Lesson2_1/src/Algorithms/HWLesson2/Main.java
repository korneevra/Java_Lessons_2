package Algorithms.HWLesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,8,3,4,7,6,2,1,9,0};
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
//        int[] a = {1,3,2,5,6,4,8,7,4};
//        HeapSort.heapify(a, a.length, 0);
//        System.out.println(Arrays.toString(a));
    }
}
