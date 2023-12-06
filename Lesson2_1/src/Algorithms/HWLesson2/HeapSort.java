package Algorithms.HWLesson2;

public class HeapSort {

    public static void sort(int[] arr){
        for (int i = arr.length/2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        for (int i = arr.length - 1; i >= 0; i--){
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {
            int t = arr[root];
            arr[root] = arr[largest];
            arr[largest] = t;
        }

        heapify(arr, size, largest);
    }
}


