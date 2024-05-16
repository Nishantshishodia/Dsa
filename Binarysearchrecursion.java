import java.util.Scanner;

public class Binarysearchrecursion {
    // function define
    public static  int binarySearch(int[]arr, int low, int high, int target){
        int result = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            //case 1
            if(arr[mid]== target){
                return mid;
            }
            // case 2
            if (arr[mid]< target){
                return binarySearch(arr, mid+1, high, target);
            }
            //case 3
            if(arr[mid]> target){
                return binarySearch(arr,mid-1, low, target);
            }
            return result;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value :");
        int target = sc.nextInt();
        // function calling
        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("No target element found in an array");
        } else {
            System.out.println("the target element of an array is: " + result);
        }
    }
}
