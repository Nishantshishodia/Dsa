import java.util.*;
// import java.io.*;

 class Bubblesort {
    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean Swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap between arr[j]&arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    Swapped = true;
                }
            }
            if (!Swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // defining array
        int arr[] = { 10, 20, 35, 15, 25, 60, 90 };
        // function calling
        bubblesort(arr);
        System.out.println("sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
