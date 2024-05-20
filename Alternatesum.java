import java.util.Scanner;

public class Alternatesum {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return sum(n - 1) - n;
        } else {
            return sum(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        int num = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the element:");
        num = Sc.nextInt();
        // function calling
        int result = sum(num);
        System.out.println("The number of element is :" + result);
    }
}
