import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements from the array :");
            int n = sc.nextInt();
            System.out.println("enter the array elements :");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // targets the elements from the user
            System.out.println("Enter the target element :");
            int y = sc.nextInt();
            // implementation of linear search
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == y) {
                    idx = i;
                    break;
                }
            }
            if (idx == -1) {
                System.out.println("searched element is not found in the array");
            } else {
                System.out.println("searched element is found at the location of" + idx);
            }
    
        }
    }

